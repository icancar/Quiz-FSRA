# FSRA

21.11.2020 zapocet rad na aplikaciji

22.11.2020 Miki je dodao pitanje sa ponudjenim odgovorima, i neke njegove funkcionalnosti 23.11.2020 Igor je dodao pitanje sa checkboxom i dodao 30 pitanja u bazu (iskljucivo tekstualnih pitanja. FS East, FS Spain, FS Czech pokriveni) i zapoceo rad na pitanjima gdje treba da se unese odgovor.

23.11.2020 Promenjen konstruktor pitanja, dodat argument za koji prima sliku. Treba videti zasto dodata slika poremeti iscrtavanje ostalih komponenti. Dalje raditi na interakciji sa gui-jem (mozda dugme za potvrdu odgovora i u njegovom Listeneru proveravati tacnost odgovora), dodati neki tajmer.

24.11 Postavio sam par pitanja i zavrsio klasu sa AnswerBoxom (sva pitanja sa boxa su dodata, osim onih sa slike). Vise od sat vremena izgubljeno na trazenju greske zasto se gui poremeti kada se slika ubaci i nisam uspio nista da promjenim. Promjenio sam da se tekst pitanja nalazi u JTextArea, jer sam primjetio kada pitanje ima dugacak tekst onda se on skroz poremeti i ne vidi se pitanje kako bi trebalo da se vidi, osim u kad je u full rezoluciji. Zbog kolokvijuma iz MSR (26.11) stigao sam samo ovo da uradim. (Ne znam kako da napravim folder, ali ovaj fajl simulator.java bi trebao da se nalazi u folderu "simulacija")


25.11 Ispis pitanja u formatu East dodao scrollPane ali pre ng sto fokus dodje na njega lose izgleda ispis, dugme koje se nalazi iznad dugmeta East namenjeno je za zavrsetak testa na East testu i za prelazak na sledece pitanje na Austria testu


26.11  Dodate funkcionalnosti na East testu, testirati brojanje tacnih odgovora i dodati tajmer za trajanje testa

26.11 Dodata pitanja iz 2014 godine, i dodat Tajmer. Nisam stigao da testiram brojanje tacnih odgovora. 

26.11 Zavrsen tip East, ja sma iskoristio tajmer iz javine biblioteke i mislim da nam je on dovoljan, testirati brojanje tacnih odgovora
      /* U bazi pitanja mislim da nam je bolje da imamo jednu zajednicku listu pitanja jer je za tip Austria potrebno random iz jednog i iz drugog skupa, a kod               
          Easta moze da se proveri samo da li je instanceof RadioButtonPitanje*/

28.11 Zapoceta Austria, komentar za prozor: ako cemo vec da koristimo prozor onda ne treba labela sa brojem tacnih odgovora na samom frejmu jer nema potrebe da stoje dva ista podatka i treba srediti da prozor iskace uvek npr na sredini ekrana ili na sredini frejma, komentar za dugme zavrsi_test: po mom misljenu dugme zavrsi bi moglo da bude uvek dostupno jer ako neko ne zna odgovor sto bi morao da lupa neki odgovor, moze samo da preda test

28.11 Austria prikazuje pitanja, ali nisam uspio da otkrijem zasto iscrta tekst pitanja na dnu prozora. Dugme "Sledece pitanje" i kada se dodje do zadnjeg pitanja pise zavrsi test gdje se vrsi provjera odgovora. Popravio sam da se dijalog postavi na centar ekrana, i ovo za lupanje odgovora sam ispravio (bio si upravu, mozda neko slucajno lupi odgovor i ispadne tacan a nije ni znao pitanje, ovako se racuna da ima 0 na tom pitanju) Dodata pitanja iz 2016 godine.

29.11 Austria prikazuje pitanja kako treba, broji odgovore. Nisam stigao da testiram kako to izgleda sa slikom, i sa answerBoxom. Dodacu sutra 2017 pitanja.

30.11 Dodat ProgressBar u Austria, postaljen tajmer da se dekrementira treba u Austria tipu pri isteku vremena da sam automatski prebaci na novo pitanje, treba i da testiramo pitanja i sa textField-om

1.12 Resen Layout za Austria tip, dodata pitanja iz 2017 godine, sutra cu da dodam CheckBoxQ klasu i da pokusam da ona proradi skroz 

02.12 Dodata pitanja iz 2018 godine. Ubacena klasa CheckBoxQ koja moze imati vise ponudjenih odgovora (potrebno jos dodati metodu koja govori je li na odgovoreno pitanje odgovoreno tacno ili ne). Potrebno popraviti AnswerBoxQ tako da ona pitanja koja imaju sliku se lijepo iscrtavaju.


03.12 Vrsi se ispis u konzolu onih odgovora koji su predati. U austria testu radi to za sve tri klase, ali iz nekog razloga u East testu nece da mi ispise odgovore koji su predati za checkBoxQ. Potrazicu sutra gresku i da namjestim da se to ispisuje u neki .txt fajl. Dodata je i metoda koja provjerava da li je dat tacan odgovor na checkBoxQ. U sustini jos je potrebno popraviti AnswerBoxQ tako da se slika fino iscrtava, i to je to. Sutra dodajem 2019 i pitanja sa slikom.
Trebalo bi da je resen Textfield u Austria, u Austria tipu postoji problem da ako se desi da pitanje ima 5 ponudjenih odgovora a sledece npr 3, on ce tu razliku ponudjenih odgovora da prepise i za sledece pitanje ali na tu razliku ponudjenih odgovora ne moze da se klikne sto je dobra stvar (ovo se desava nekako asinhrono, u nekim slucajeviva dobro radi u nekim ne), u East tipu se TextField lepo ispise ukoliko ako ima pitanje ima sliku, a ako nema Text field je vecih dimenzija od zeljenih.

4.12 Resen layout za sve, i neka beskonacna petlja se desi kada se u kreirajEast u if-u stavi instanceof CheckBox. Dodata funkcionalnost da po isteku vremena u Austria sam predje na sledece pitanje ili sam zavrsi test ukoliko je to poslednje pitanje. Resen i ispis u konzolu za CheckBoxQ.

5.12 Dodata pitanja za 2019 godinu. Ostaje jos par pitanja sa slikom da se ubaci i to je to

10.12 Srednejno 120 pitanja za prelom teksta, zaboravio sam da azuriram tajmer za East
11.12 Sredjena su sva pitanja za prelom teksta, dodato jos nekoliko sa slikom i namjesten tajmer za East i austria.
