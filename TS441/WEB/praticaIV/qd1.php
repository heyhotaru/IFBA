<?php 

$texto = ("Digite um valor ");
$texto2 = ("Digite o segundo valor ");
$n = readline($texto);
$m = readline($texto2);
$soma = null;

if($n <= 0){
    echo("Número invalido! ");
}else{
    for($i = $n; $i <= $m; $i++){
    $soma += $i;

    echo("$soma\n");
    }
}
