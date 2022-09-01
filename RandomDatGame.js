const groupA = ['Jamie', 'Tyrion', 'Jon', 'Brandon', 'Tywin'];

const groupB = ['Cersei', 'Arya', 'Misendei', 'Lyanna', 'Sansa'];

const places = ['Winterfell', 'Kings landing', ' The Eyrie', 'Casterly rock', 'The twins'];

var nameMatch1 = groupA[Math.floor(Math.random()*groupA.length)];

var nameMatch2 = groupB[Math.floor(Math.random()*groupB.length)];

var nameVenue = places[Math.floor(Math.random()*places.length)];

// The console will pick names and venue at random anytime you press run
console.log(`${nameMatch1} and ${nameMatch2} will be going on a dinner date at ${nameVenue}.`); 