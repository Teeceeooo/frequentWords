<h1>frequentWords</h1>
Syftet med denna applikation är att returnera de 10 mest frekventa orden från ett text input.

<h1>Förutsättningar</h1>
<li>Java 17 eller senare</li>
<li>Spring Boot 3.2.4</li>
<li>Maven</li>

<h1>Installation - lokalt</h1>
<li>Installera via git clone https://github.com/Teeceeooo/frequentWords.git</li>
<li>Öppna projektet i valfri IDE t.ex IntelliJ.</li>
<li>Kör programmet.</li>

<h1>Användning via curl</h1>
I cmd/PowerShell använd kommandot: curl -H "Content-type: text/plain" -X "POST" -d "Insätt din text som du vill analysera här" http://localhost:8080/count

<h1>Användning via Postman</h1>
<li>Gör en POST request mot http://localhost:8080/count</li>
<li>Under Headers se till att det finns en key med namn Content-Type som har value text/plain</li>
<li>Under Body sätter du in din text du vill analysera</li>
<li>Tryck send</li>
