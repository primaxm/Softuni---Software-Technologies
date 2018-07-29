<?php
if (isset($_GET['person']) && $_GET['person'] !== null) {
    $name = htmlspecialchars($_GET['person']);
    echo "Hello, $name!";
} else {
    ?>
    <form>
        Name: <input type="text" name="person" />
        <input type="submit" />
    </form>
    <?php
}




