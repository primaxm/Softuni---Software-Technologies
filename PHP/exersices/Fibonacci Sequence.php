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
        $a = 1;
        $b = 1;
        echo $a . " ";
        for ($i=2; $i <= $number; $i++) { 
            $tmp = $b;
            $b += $a;
            echo $a = $tmp . " ";

        }
    }
    ?>
</body>
</html>