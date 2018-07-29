<?php
if (isset($_GET['text'])) {
    preg_match_all('/\w+/', $_GET['text'], $words);
    $words = $words[0];
    $upperWords = array_filter($words, function ($word) {
        return strtoupper($word) == $word;
    });
    echo implode(', ', $upperWords);
} else {
    echo "<form>
        <textarea rows=\"10\" name=\"text\"></textarea> <br>
        <input type=\"submit\" value=\"Extract\">
    </form>";
}
