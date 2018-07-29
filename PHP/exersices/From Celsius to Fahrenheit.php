<?php
if (isset($_GET['cel'])) {
    $far = floatval($_GET['cel']) * 9/5 + 32;
    $msgAfterCelsius = floatval($_GET['cel']) . "&deg;C =" . $far . "&deg;F";
}

if (isset($_GET['fah'])) {
    $far = (floatval($_GET['fah']) - 32) / 1.8;
    $msgFahrenheit = floatval($_GET['fah']) . "&deg;F =" . $far . "&deg;C";
}
?>
<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?= $msgFahrenheit ?>
</form>