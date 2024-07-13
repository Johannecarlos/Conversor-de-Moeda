<header>
        <h1>Conversor de Moedas</h1>
    </header>
    <div class="container">
        <section>
            <p>Este é um projeto de conversor de moedas desenvolvido em Java. O objetivo é permitir a conversão de valores entre diferentes moedas utilizando uma API para obter as cotações em tempo real. O projeto foi desenvolvido para praticar habilidades de programação em Java, incluindo manipulação de APIs e interação com o usuário via console.</p>
        </section>
        <section>
            <h2>Objetivo</h2>
            <p>Construir um programa em Java que interage com o usuário via console, oferecendo pelo menos seis opções de conversão de moedas. O usuário escolhe uma opção, informa o valor a ser convertido e o programa exibe o valor convertido.</p>
        </section>
        <section>
            <h2>Funcionalidades</h2>
            <ul>
                <li><strong>Menu de opções de conversão:</strong>
                    <ul>
                        <li>Dólar para Real</li>
                        <li>Real para Dólar</li>
                        <li>Escolher outras moedas</li>
                        <li>Sair</li>
                    </ul>
                </li>
                <li><strong>Conversão dinâmica:</strong>
                    <p>Os valores de cotação são obtidos em tempo real por meio da API Extended Rate.</p>
                </li>
                <li><strong>Interação com o usuário:</strong>
                    <p>Entrada de dados via console e exibição do valor convertido.</p>
                </li>
            </ul>
        </section>
        <section>
            <h2>Requisitos</h2>
            <ul>
                <li>Conhecimentos básicos em Java e Orientação a Objetos.</li>
                <li>Ambiente Java configurado.</li>
                <li>IntelliJ IDEA ou outra IDE de sua preferência.</li>
            </ul>
        </section>
        <section>
            <h2>Tecnologias Utilizadas</h2>
            <ul>
                <li><strong>Java</strong></li>
                <li><strong>API Extended Rate</strong></li>
                <li><strong>GSON:</strong> Biblioteca para desserialização de JSON.</li>
            </ul>
        </section>
        <section>
            <h2>Estrutura do Projeto</h2>
            <p>O projeto está estruturado em pacotes para melhor organização do código:</p>
            <ul>
                <li><strong>service</strong>: Contém a classe <code>Conversor</code> responsável pela lógica de conversão e interação com a API.</li>
                <li><strong>view</strong>: Contém a classe <code>View</code> responsável pela interação com o usuário via console.</li>
            </ul>
        </section>
        <section>
            <h2>Como Rodar o Projeto</h2>
            <ul>
                <li>Clone este repositório.</li>
                <li>Importe o projeto em sua IDE.</li>
                <li>Configure a chave da API Extended Rate na classe <code>Conversor</code>.</li>
                <li>Execute a classe <code>View</code> para iniciar o programa.</li>
            </ul>
        </section>
        <section>
            <h2>Exemplo de Uso</h2>
            <ul>
                <li>Selecione a opção de conversão.</li>
                <li>Informe o valor a ser convertido.</li>
                <li>Veja o valor convertido exibido no console.</li>
            </ul>
        </section>
        <section>
            <h2>Desafios Extras</h2>
            <ul>
                <li>Implementar um histórico de conversões.</li>
                <li>Adicionar registro de logs com data e hora.</li>
                <li>Explorar outras APIs gratuitas.</li>
            </ul>
        </section>
        
