<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
<?php
$a = 0;

for ($i=0; $i < 5; $i++) {
    $b = 0; 
    for ($s=0; $s < 10; $s++) {
        $c = $a + $b;
        echo "<div style=\"background-color:rgb($c, $c, $c)\"></div>";
        $b += 5;
    }
    echo "<BR />";
    $a += 51;
}

?>
</body>
</html>