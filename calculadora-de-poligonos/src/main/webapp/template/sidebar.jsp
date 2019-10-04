<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="list-group flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
        <a class="${titulo.id eq 'CIRCULO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormCirculo">Círculo</a>
        <a class="${titulo.id eq 'LOSANGO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormLosango">Losango</a>
        <a class="${titulo.id eq 'PARALELOGRAMO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormParalelogramo">Paralelogramo</a>
        <a class="${titulo.id eq 'QUADRADO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormQuadrado">Quadrado</a>
        <a class="${titulo.id eq 'RETANGULO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormRetangulo">Retângulo</a>
        <a class="${titulo.id eq 'TRAPEZIO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormTrapezio">Trapézio</a>
        <a class="${titulo.id eq 'TRIANGULO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavFormTriangulo">Triângulo</a>
        <a class="${titulo.id eq 'HISTORICO' ? 'list-group-item active' : 'list-group-item'}"  href="calculadora?acao=NavHistorico">Histórico</a>
</div>