<h1>frequentWords</h1>
Syftet med denna applikation är att returnera de 10 mest frekventa orden från ett text input.

<h1>Förutsättningar</h1>
<li>Java 17 eller senare</li>
<li>Spring Boot 3.2.4</li>
<li>Maven</li>

<h1>Installation - lokalt</h1>
<li>Installera via git clone https://github.com/Teeceeooo/frequentWords.git</li>
<li>Öppna projektet i valfri IDE t.ex IntelliJ</li>
<li>Kör programmet</li>

<h1>Användning via curl</h1>
<li>Öppna cmd</li>
<li>Om du vill analysera text med UTF-8 encoding, kör kommandot: chcp 65001</li>
<li>För att analysera direkt kör kommandot: echo Insätt din text som du vill analysera här | curl -X POST -H "Content-Type: text/plain; charset=utf-8" --data-binary @- http://localhost:8080/count</li>
<li>För att analysera via en .txt fil kör kommandot där du byter ut C:/lyrics.txt mot din sökväg samt filnamn: curl -X POST -H "Content-Type: text/plain; charset=utf-8" --data-binary "@C:/lyrics.txt" http://localhost:8080/count</li>
<li>Notera att formatet du vill analysera måste vara ren text. Därför fungerar det inte att använda .docx som format. Om du vill använda .docx, måste du konvertera filen till ren text eller kopiera/klista in i ett .txt dokument.</li>

<h1>Användning via Postman</h1>
<li>Gör en POST request mot http://localhost:8080/count</li>
<li>Under Body väljer du raw och sätter in din text du vill analysera</li>
<li>Tryck send</li>
