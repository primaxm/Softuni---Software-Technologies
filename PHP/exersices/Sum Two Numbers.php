<?php
if(isset($_GET['num1']) && isset($_GET['num2'])) {
    $sum = floatval($_GET['num1']) + floatval($_GET['num2']);
    echo floatval($_GET['num1']) . "+" . floatval($_GET['num2']) . "=" . $sum;
?>

<form>
    <div>First Number:</div>
    <input type="number" name="num1" />
    <div>Second Number:</div>
    <input type="number" name="num2" />
    <div><input type="submit" /></div>
</form>
<?php
}
?>