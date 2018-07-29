<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<?php
five(5);
leftOne(5);
five(5);
RightOne(5);
five(5);

?>
</body>
</html>

<?php
function five ($a) {
    for ($i = 0; $i < $a; $i++) {
    echo "<button style=\"background-color: blue\">1</button>";
    }
    echo "<BR>";
}

function leftOne ($a) {
    for ($s=0; $s < 3; $s++) { 
        echo "<button style=\"background-color: blue\">1</button>";
        for ($i = 1; $i < $a; $i++) {
            echo "<button>0</button>";
        }
        echo "<BR>";
    }
}

function RightOne($a)
{
    for ($s=0; $s < 3; $s++) { 
       
        for ($i = 1; $i < $a; $i++) {
            echo "<button>0</button>";
        }
        echo "<button style=\"background-color: blue\">1</button>";
        echo "<BR>";
    }
    
}