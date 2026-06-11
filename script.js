let randomNumber =
Math.floor(Math.random() * 100) + 1;

let attempts = 0;

function checkGuess(){

let guess =
Number(document.getElementById("guessInput").value);

attempts++;

if(guess > randomNumber){

document.getElementById("message").innerHTML =
"📈 Too High!";

}

else if(guess < randomNumber){

document.getElementById("message").innerHTML =
"📉 Too Low!";

}

else{

document.getElementById("message").innerHTML =
"🎉 Correct Guess!";

document.getElementById("attempts").innerHTML =
"Attempts: " + attempts;

}
}