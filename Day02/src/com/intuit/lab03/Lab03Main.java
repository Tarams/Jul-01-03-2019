package com.intuit.lab03;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab03Main {

	public static void main(String[] args) throws Exception {
		store(line -> line.split(",")[0], "./cities.txt");
		store(line -> line.split(",")[1], "./states.txt");
		printCitiesGroupedByState();
		printStatesCount();
		generatePlacesJson();
	}
	
	private static String getJsonText(String line) {
		StringBuffer json = new StringBuffer("");
		json.append("{");
		json.append("\"city\"");
		json.append(":");
		json.append("\"");
		json.append(line.split(",")[0]);
		json.append("\"");
		json.append(",");
		json.append("\"state\"");
		json.append(":");
		json.append("\"");
		json.append(line.split(",")[1]);
		json.append("\"");
		json.append(",");
		json.append("\"geonameid\"");
		json.append(":");
		json.append(line.split(",")[2]);
		json.append("}");
		return json.toString();
	}

	private static void generatePlacesJson() throws Exception {
		List<String> lines = Files.readAllLines(Paths.get("./places.txt"));
		String json = lines
			.stream()
			.skip(1)
			.map(Lab03Main::getJsonText)
			.collect(Collectors.joining(",\n", "{\n\"places\": \n[\n", "\n]\n}"));
		Files.write(Paths.get("./places.json"), json.getBytes());
	}



	//Print the count of all unique states
	private static void printStatesCount() throws Exception {
		List<String> lines = Files.readAllLines(Paths.get("./places.txt"));
		final long stateCount = lines
									.stream()
									.skip(1)
									.map(line -> line.split(",")[1])
									.distinct()
									.count();
		System.out.println("State count: " + stateCount);
	}

	
	//Print the count of all cities grouped by state
	private static void printCitiesGroupedByState() throws Exception {
		List<String> lines = Files.readAllLines(Paths.get("./places.txt"));
		lines
		.stream()
		.skip(1)
		.collect(Collectors.groupingBy(line -> line.split(",")[1]))
		.forEach((state, cities) -> {
			System.out.println(state + ": " + cities.size());
		});
	}


	private static void store(Function<String, String> mapFunction, String fileName) throws Exception {
		List<String> lines = Files.readAllLines(Paths.get("./places.txt"));
		String cities  = lines
				.stream()
				.skip(1)
				.map(mapFunction)
				.distinct()
				.collect(Collectors.joining("\n"));
		Files.write(Paths.get(fileName), cities.getBytes());
	}



}
