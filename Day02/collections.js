let languages = ["Java", "Ruby", "JavaScript", "Scala", "Clojure"];

//arrow functions
/*languages
		.filter(e => {
			console.log("filter1: " + e);
			return e.startsWith("J");
		})
		.filter(e => {
			console.log("filter2: " + e);
			return e.length > 5;
		})
		.forEach(e => console.log(e));*/
		
let langs = languages
		.filter(e => {
			console.log("filter1: " + e);
			return e.startsWith("J");
		})
		.filter(e => {
			console.log("filter2: " + e);
			return e.length > 5;
		});
console.log(langs[0]);

