<head>
<style>
div {
  display: inline-block;
  width: 150px;
  padding: 2px;
  margin: 5px;
}
</style>
</head>

<?php
for ($i=0; $i < 256; $i+=51) { 
    for ($a=0; $a <= 256; $a+=51) { 
        for ($b=0; $b < 256; $b+=51) { 
            echo "<div style='background:rgb($i, $a, $b)'>rgb($i, $a, $b)</div>";
        }
    }
}