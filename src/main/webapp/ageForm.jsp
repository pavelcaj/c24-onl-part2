<html>
<head>
    <title>Input your age</title>
</head>
<body>
<h1>Input your age:</h1>
<input type="text" id="ageInput">
<button onclick="submitAge()">confirm</button>
<p id="result"></p>

<script>
    function submitAge() {
        var age = document.getElementById("ageInput").value;
        if (age === "" || isNaN(age)) {
            document.getElementById("result").innerHTML = "Please enter the correct age .";
        } if(age>=18) {
            document.getElementById("result").innerHTML = "Adult";
        }else{
            document.getElementById("result").innerHTML = "Minor";
        }
    }
</script>
</body>
</html>