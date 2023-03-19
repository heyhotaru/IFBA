<?php

$texto = ("Digite um valor ");
$n = readline($texto);
$soma = null;

for($h = 1; $h <= $n; $h++){
    $soma += 1 / $h;

    echo("$soma \n");
}
echo("\n$soma\n");