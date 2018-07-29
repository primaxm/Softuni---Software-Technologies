<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if (isset($_GET['num'])) {
        $number = intval($_GET['num']);
        echo $a = 1 . " ";
        echo $b = 1 . " ";
        echo $c = 2 . " ";
        for ($i=4; $i <= $number; $i++) { 
            
            $tmp = $c;
            echo $c = ($a + $b + $c) . " ";
            $a = $b;
            $b = $tmp;
        }
    }
    ?>
</body>
</html>