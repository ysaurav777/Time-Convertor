let hoursInputEl = document.getElementById("hoursInput");
let minutesInputEl = document.getElementById("minutesInput");
let convertBtnEl = document.getElementById("convertBtn");
let timeInSecondsEl = document.getElementById("timeInSeconds");
let errorMsgEl = document.getElementById("errorMsg");

function startUp() {
    if (hoursInputEl.value === "") {
        errorMsgEl.textContent = "Please enter a valid number of hours.";
    } else if (minutesInputEl.value === "") {
        errorMsgEl.textContent = "Please enter a valid number of minutes.";
    } else {
        let totalmin = (parseInt(hoursInputEl.value) * 60) + parseInt(minutesInputEl.value);
        let totalsec = (parseInt(totalmin) * 60);
        errorMsgEl.classList.add("d-none");
        timeInSecondsEl.textContent = totalsec + "s";
        timeInSecondsEl.classList.add("con");
    }
}

convertBtnEl.addEventListener("click", startUp);