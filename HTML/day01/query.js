
function addElement() {
    var li = document.createElement("li");
    var inputValue = document.getElementById("input").value;
    var temp = document.createTextNode(inputValue);
    li.append(temp);

    if (inputValue.trim() == "") {
        alert("Enter Something!!!");
        document.getElementById("input").value = "";
    } else {
        document.getElementById("myUl").appendChild(li);
        document.getElementById("input").value = "";

        var btn = document.createElement("BUTTON");
        btn.className = "close";
        btn.innerHTML = "x";

        btn.onclick = function () {
            var choice = confirm("Sure to remove the task?");
            if (choice) {
                var li = this.parentElement;
                li.remove();
            }
        };

        li.appendChild(btn);
    }
}