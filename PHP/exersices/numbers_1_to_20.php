<ul>
<?php

for ($i=1; $i <= 20; $i++) { 
    $color = "blue";
    if($i % 2 == 0)$color = "green";
    echo "<li><span style='color:$color'>$i</span></li>";
}
?>
</ul>