<?php 

$texto = ("Digite um valor inteiro");
$n = readline($texto);
$soma = null;

for($i = 1; $i <= $n; $i++){
    if($i % 2 == 0 && $i % 4 == 0){
        $soma = $soma + $i;
        echo("$soma\n");
    }
}