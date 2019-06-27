public class Chapter {
    private int chapter;
    private String fisik = "";
    private String sihir = "";
    private String skillAmbil = "";
    private int randPoint = (int) (Math.random() * 16) + 5;
    private int randStats;
    private int randHP = randPoint;
    private int randMP = randPoint;
    private int randSTR = (int) (Math.random() * 7) + 3;
    private int randVIT = (int) (Math.random() * 7) + 3;
    private int randINT = (int) (Math.random() * 6) + 3;
    private Item itemBisaDigunakan;
    public Chapter(int chapter) {
        this.chapter = chapter;
    }

    public void aksi(String cmd, int story) {
        switch (cmd) {
            case "next":
                switch (this.chapter) {
                    case 1:
                        chapter1("next", story);
                        break;
                    case 2:
                        chapter2("next", story);
                        break;
                    case 3:
                        chapter3("next", story);
                        break;
                }
                break;

            case "a":
                switch (this.chapter) {
                    case 1:
                        chapter1("a", story);
                        break;
                    case 2:
                        chapter2("a", story);
                        break;
                    case 3:
                        chapter3("a", story);
                        break;
                }
                break;

            case "b":
                switch (this.chapter) {
                    case 1:
                        chapter1("b", story);
                        break;
                    case 2:
                        chapter2("b", story);
                        break;
                    case 3:
                        chapter3("b", story);
                        break;
                }
                break;

            case "c":
                switch (this.chapter) {
                    case 1:
                        chapter1("c", story);
                        break;
                    case 2:
                        chapter2("c", story);
                        break;
                    case 3:
                        chapter3("c", story);
                        break;
                }
                break;
        }
    }

    private void chapter1(String cmd, int story) {
        switch (cmd) {
            case "next":
                switch (story) {
                    case 1:
                        storyPanel.addStory("Dengan terburu-buru dia mengeluarkan sepedanya dari parkiran, lantas dia menyusuri jalan dengan cepat dan menyebrang jalan tanpa melihat kebelakang. Sial dia tak menyadari ada truk yang sedang melaju dengan cepat dan seketika menabrak dia sampai terbang kedepan sejauh 10 meter.");
                        break;
                    case 2:
                        storyPanel.addStory("Hugo terbangun, dia tidak merasakan apapun pada tubuhnya, seperti tidak ada yang terjadi padanya. Orang-orang mulai berkumpul mendekatinya, Hugo berkata \"tidak apa-apa, aku baik-baik saja\" sambil mencoba untuk duduk, tetapi orang-orang yang sudah berkumpul seperti tidak ada yang mendengar. dia tidak bisa mendengar apapun dari orang-orang yang berkumpul, yang ia dengar hanya gumaman, terlalu bising untuk mendengar seseorang mengatakan apa yang terjadi. Sampai akhirnya ada orang yang mendekatinya dan orang itu berkata \"dia sudah mati, tabrakan itu cukup keras untuk membuatnya mati seketika\" dan Hugo kembali tak sadarkan diri.");
                        break;
                    case 3:
                        storyPanel.addStory("Hugo sekarang terbangun di sebuah ruangan, dikelilingi air yang berasal dari atas dengan sebuah gua sebagai tempat mengalirnya air tersebut. Setelah beberapa saat turunlah seorang dewa\n" +
                                "Dewa: \"Halo, saya dewa air, Poseidon. Saat ini kamu sudah mati.\"\n" +
                                "Hugo: \"Fuh, akhirnya..\"\n" +
                                "Dewa: \"Sepertinya kamu sangat menantikannya ya, meskipun harus mati dengan keadaan seperti itu.. hahahaha~\"\n" +
                                "Hugo: \"Sudahlah, jangan bahas itu.. Sekarang, kenapa aku ada disini? apa ini kehidupan setelah mati?\"");
                        break;
                    case 4:
                        storyPanel.addStory("Dewa: \"Oke, kamu saat ini berada di ruang pemilihan. Disini kamu akan memilih untuk menunggu sampai dunia berakhir dan menghadapi penghakiman, atau kamu akan mengisi waktu sampai dunia berakhir untuk kembali dihidupkan di dunia yang aku buat, dunia dimana terdapat petualangan seru. Di dunia itu kamu bisa menebus segala dosamu dari kehidupan sebelumnya untuk menghadapi penghakiman. Ya seperti diberi kesempatan kedua untukmu hidup. Jadi bagaimana? kamu mau memilih mana?\"");
                        break;
                    case 7:
                        storyPanel.addStory("Dewa: \"Oke hugo, kau telah memilih "+skillAmbil+" sekarang kamu siap untuk menjelajahi dunia baru mu, disana kamu bebas melakukan apa saja seperti ketika kamu hidup di dunia sebelumnya, tetapi lebih baik kamu pakai kesempatan ini untuk menutup dosamu selama di dunia sebelumnya. Sampai jumpa dan selamat jalan.\"\nDewa itu hilang dan semua menjadi putih...");
                        break;
                }
                break;

            case "a":
                switch (story) {
                    case 5:
                        storyPanel.addStory("Hugo kembali tidak sadar, selama ia tidak sadar ia bermimpi tentang semua hal yang pernah ia lakukan, dimulai dari ketika ia berumur 2 tahun sampai akhirnya ia mati tertabrak truk. Lalu ia terbangun di sebuah padang rumput, selama memandang keseluruh arah ia hanya melihat hamparan rumput hijau. Dan waktu penghakiman tiba.");
                        ThreadGUI.objectPlayer.setGameOver();
                        break;
                    case 6:
                        randStats = (int) (Math.random() * 3) + 1;
                        switch (randStats) {
                            case 1:
                                fisik = "Hugo mendapat sebuah Sword dengan memberikan tambahan Health Point sebesar "+randHP;
                                ThreadGUI.objectPlayer.addMaxStatus("HP", randHP);
                                Senjata longsw = new SenjataFisik("longsword", "Long Sword", 20);
                                ThreadGUI.objectPlayer.setUsedSenjata(longsw);
                                break;
                            case 2:
                                fisik = "Hugo mendapat sebuah Axe dengan memberikan tambahan stats STR sebesar "+randSTR;
                                ThreadGUI.objectPlayer.addStats(1, randSTR);
                                Senjata axe = new SenjataFisik("axe", "Axe", 15);
                                ThreadGUI.objectPlayer.setUsedSenjata(axe);
                                break;
                            case 3:
                                fisik = "Hugo mendapat sebuah Double Sword dengan memberikan tambahan stats INT sebesar "+randINT;
                                ThreadGUI.objectPlayer.addStats(2, randINT);
                                Senjata doublesw = new SenjataFisik("doublesword", "Double Sword", 17);
                                ThreadGUI.objectPlayer.setUsedSenjata(doublesw);
                                break;
                        }
                        skillAmbil = "kekuatan fisik";
                        storyPanel.addStory(fisik);
                        break;
                }
                break;

            case "b":
                switch (story) {
                    case 5:
                        storyPanel.addStory("Dewa: \"Pilihan yang bagus, Hugo. Baiklah, kamu tidak akan ke dunia itu tanpa membawa apapun. Saya memberi tawaran untukmu, sebuah pedang yang hebat, yang memberimu kekuatan. Atau kamu ingin sebuah kemampuan sihir?\" Sembari terlihat senang dengan piliihan Hugo");
                        break;
                    case 6:
                        randStats = (int) (Math.random() * 3) + 1;
                        switch (randStats) {
                            case 1:
                                sihir = "Hugo mendapat sebuah Staff dengan memberikan tambahan Mana Point sebesar "+randMP;
                                ThreadGUI.objectPlayer.addMaxStatus("HP", randMP);
                                Senjata staff = new SenjataMagic("staff", "Staff", 18);
                                ThreadGUI.objectPlayer.setUsedSenjata(staff);
                                break;
                            case 2:
                                sihir = "Hugo mendapat sebuah Wheel dengan memberikan tambahan stats VIT sebesar "+randVIT;
                                ThreadGUI.objectPlayer.addStats(0, randVIT);
                                Senjata wheel = new SenjataMagic("wheel", "Wheel", 14);
                                ThreadGUI.objectPlayer.setUsedSenjata(wheel);
                                break;
                            case 3:
                                sihir = "Hugo mendapat sebuah Long Staff dengan memberikan tambahan stats STR sebesar "+randSTR;
                                ThreadGUI.objectPlayer.addStats(1, randSTR);
                                Senjata stick = new SenjataMagic("stick", "Stick", 13);
                                ThreadGUI.objectPlayer.setUsedSenjata(stick);
                                break;
                        }
                        storyPanel.addStory(sihir);
                        skillAmbil = "kekuatan sihir";
                        break;
                }
                break;
        }
    }

    private void chapter2(String cmd, int story) {
        switch (cmd) {
            case "next":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Aku tak bisa melihat apapun selain pegunungan..\"");
                        storyPanel.tahapStory = 1;
                        break;
                    case 3:
                        storyPanel.addStory("Berlari... hujan mulai turun.. semakin deras ketika sudah dekat dengan gua..");
                        break;
                    case 4:
                        storyPanel.addStory("Hugo sampai dan masuk ke dalam gua, dengan keadaan basah kuyup dan kedinginan, ia membuat sebuah api unggun yang ia pelajari pada game Stranded Deep.\n" +
                                "\"Beruntunglah aku dulu sempat bermain game itu.. hahahaha~\"\n" +
                                ".... .... ....\n.... ....\n....\n" +
                                "\"Sial, hujan ini membuatku tak bisa mencari makan, aku kelaparan, kapan hujan ini reda !\"\n" +
                                "Sebaiknya aku mencari makanan disini.. mungkin ada sesuatu yang bisa aku makan.");
                        break;
                    case 5:
                        storyPanel.addStory("\"Gelap banget, untung tadi bawa obor..\"\n... ... ...\n... ...\n" +
                                "Hugo melihat sebuah tugu, dia mendekatinya dan tedapat tulisan \'Trainer\'.");
                        break;
                    case 6:
                        storyPanel.addStory("tugu itu lalu berbicara\n" +
                                "Trainer: \"Sudah lama aku tak melihat seseorang disini. Hai anak muda.. Beruntung kau menemukank disini.. kamu bisa mencoba kekuatanmu yang baru kamu dapatkan itu padaku !\"\n" +
                                "Hugo takut sekaligus penasaran dengan kekuatan yang baru dia dapatkan itu.\n" +
                                "Hugo: \"Hmm... apa benar kekuatan yang kudapatkan tadi itu benar-benar nyata?\"");
                        break;
                    case 7:
                        storyPanel.addStory("Hugo menyerang tugu, dengan "+skillAmbil+"nya, ia kebingungan dengan apa yang telah ia lakukan..\n" +
                                "... ...\n" +
                                "Trainer: \"Kau memang cocok mendapat "+skillAmbil+" itu, terimalah ini, cairan ini akan menambah serangan dasarmu.\"\n" +
                                "Hugo menerima sebuah cairan didalam botol kecil seukuran gelas teh, ia langsung meminumnya.");
                        Item cairan = new ConsumableItem("cairan", "Cairan Seperti Teh", 1, 2, (int) (Math.random() * 10) + 1);
                        ThreadGUI.objectPlayer.addKeTas(cairan);
                        ThreadGUI.objectPlayer.gunakanItem("cairan");
                        break;
                    case 8:
                        storyPanel.addStory("glek... glek... glek...\n" +
                                "kekuatan seranganmu sekarang bertambah...\n" +
                                "Trainer: \"Teruslah berjalan, kau akan menemukan sebuah pintu dan juga seorang petapa. jawab pertanyaan ini\n" +
                                "\'Kota apa yang hurufnya merupakan penjumlahan E dan G?\'\n" +
                                "Pikirkan jawabannya sembari kamu menyusuri gua ini.\"\n" +
                                "Hugo pun melanjutkan perjalanannya.");
                        break;
                    case 9:
                        storyPanel.addStory("Hugo: \"Apa itu cahaya?\"\n" +
                                "Cahaya itu terlalu redup untuk melihat area sekitar cahaya itu.\n" +
                                "Hugo lalu berjalan menuju cahaya itu.");
                        break;
                    case 10:
                        storyPanel.addStory("Ketika menyusuri gua yang gelap, ia merasa menyentuh sesuatu di dinding kiri gua.\n" +
                                "Hugo: \"Apa ini? teksturnya seperti kayu, mana mungkin kayu ada di tempat seperti ini?\"\n" +
                                "Ia lalu berbalik ke kiri dan melihat ada sebuah pintu dari kayu.");
                        break;
                    case 11:
                        storyPanel.addStory("Hugo: \"Paling juga ini cuman hiasan yang orang iseng buat\"\n" +
                                "Hugo pun melanjutkan perjalanan menuju cahaya");
                        break;
                    case 12:
                        storyPanel.addStory("Hugo terus berjalan mendekati cahaya, sampai akhirnya dia bisa melihat ada seseorang yang berada di bawah cahaya obor itu.\n" +
                                "Hugo: \"Apa itu seseorang? akhirnya aku menemukan makhluk yang sama sepertiku, mungkin dia punya makanan..\"\n" +
                                "Hugo berlari dan setelah sampai, Hugo bertanya pada orang itu\n" +
                                "Hugo: \"Hello, apa kamu punya makanan? aku lapar sekali..\"\n" +
                                "Petapa: \"Apa jawabanmu?\"");
                        break;
                    case 13:
                        storyPanel.addStory("...");
                        break;
                    case 17:
                        storyPanel.addStory("Setelah beberapa menit berjalan, ia sekarang berada di depan pintu kayu itu.");
                        break;
                    case 18:
                        storyPanel.addStory("Kunci perak telah digunakan, sekarang pintu bisa dibuka.\n" +
                                "Hugo perlahan membuka pintu kayu itu...\n");
                        break;
                }
                break;

            case "a":
                Item kunciperak = new UsableItem("kunciperak", "Kunci Perak", 2);
                Item roti = new ConsumableItem("roti", "Roti", 1, 1, 50);
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Apa itu sebuah gua? sepertinya aku bisa pergi kesana untuk berlindung dari hujan. Tak ada tempat lain lagi yang bisa aku pakai untuk berteduh..\nSsebaiknya aku berlari sebelum hujan turun..\"");
                        break;
                    case 7:
                        storyPanel.addStory("Hugo pun melanjutkan perjalanannya kedalam gua");
                        storyPanel.tahapStory++;
                        break;
                    case 11:
                        storyPanel.addStory("Hugo: \"Apa yang ada di dalam ini?\"\n" +
                                "Hugo mencoba membuka pintu itu tetapi tak bisa dibuka.\n" +
                                "Hugo: \"Sial, pintu ini tak bisa dibuka.\"\n" +
                                "Hugo pun melanjutkan kembali perjalanan menuju cahaya.");
                        break;
                    case 13:
                        storyPanel.addStory("Petapa : \"Terimalah ini sebagai penghargaan atas pengetahuanmu. Lanjutkanlah perjalananmu, dan ingatlah hanya orang yang memiliki tujuan yang dapat lolos dari segala rintangan.\"\n" +
                                "Petapa itu memberikan sebuah kunci perak dan roti, dan petapa itu terlihat seperti tertidur.\n" +
                                "Hugo langsung memakan roti itu.. setelah roti habis, ia teringat dengan pintu yang sebelumnya dia lewati ketika menuju cahaya yang ada di atas petapa.\n" +
                                "Hugo mengambil obor itu dari atas petapa dan kembali ke pintu itu ada.");
                        ThreadGUI.objectPlayer.addKeTas(kunciperak);
                        ThreadGUI.objectPlayer.addKeTas(roti);
                        ThreadGUI.objectPlayer.gunakanItem("roti");
                        storyPanel.tahapStory = 17;
                        break;
                    case 16:
                        storyPanel.addStory("Petapa : \"Terimalah ini sebagai penghargaan atas pengetahuanmu. Lanjutkanlah perjalananmu, dan ingatlah hanya orang yang memiliki tujuan yang dapat lolos dari segala rintangan.\"\n" +
                                "Petapa itu memberikan sebuah kunci perak dan roti, dan petapa itu terlihat seperti tertidur.\n" +
                                "Hugo langsung memakan roti itu.. setelah roti habis, ia teringat dengan pintu yang sebelumnya dia lewati ketika menuju cahaya yang ada di atas petapa.\n" +
                                "Hugo mengambil obor itu dari atas petapa dan kembali ke pintu itu ada.");
                        ThreadGUI.objectPlayer.addKeTas(kunciperak);
                        ThreadGUI.objectPlayer.addKeTas(roti);
                        ThreadGUI.objectPlayer.gunakanItem("roti");
                        break;
                }
                break;

            case "b":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Hanya ada hutan di timur. Akan terlalu berbahaya sepertinya jika hujan turun.\"");
                        storyPanel.tahapStory = 1;
                        break;
                    case 13:
                        storyPanel.addStory("...");
                        break;
                }
                break;

            case "c":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Tak ada apapun di arah ini, hanya hamparan padang rumput yang hijau, aku ingin menikmati ini andai saja gak mendung.\"");
                        storyPanel.tahapStory = 1;
                        break;
                    case 13:
                        storyPanel.addStory("Pepatah berkata \"Jangan sia-siakan kesempatan sekecil apapun...\"\n" +
                                "Hugo teringat dengan sebuah tugu bertuliskan \'Trainer\' yang dia lewati tadi.");
                        break;
                    case 14:
                        storyPanel.addStory("Hugo kembali mengikuti jalur yang ia lewati. Tak begitu lama ia melihat tugu itu.\n" +
                                "Tanpa ragu ia menyerang tugu, dengan "+skillAmbil+"nya, ia kebingungan dengan apa yang telah ia lakukan..\n" +
                                "Trainer: \"Kau memang cocok mendapat "+skillAmbil+" itu, terimalah ini, cairan ini akan menambah serangan dasarmu.\"\n" +
                                "Hugo menerima sebuah cairan didalam botol kecil seukuran gelas teh, ia langsung meminumnya.");
                        Item cairan = new ConsumableItem("cairan", "Cairan Seperti Teh", 1, 2, (int) (Math.random() * 10) + 1);
                        ThreadGUI.objectPlayer.addKeTas(cairan);
                        ThreadGUI.objectPlayer.gunakanItem("cairan");
                        break;
                    case 15:
                        storyPanel.addStory("glek... glek... glek...\n" +
                                "kekuatan seranganmu sekarang bertambah...\n" +
                                "Trainer: \"Kembali lagi pada petapa itu dan jawab pertanyaan ini\n" +
                                "\'Kota apa yang hurufnya merupakan penjumlahan E dan G?\'\n" +
                                "Pikirkan jawabannya sembari kamu menyusuri gua ini.\"\n" +
                                "Hugo pun berlari menuju petapa itu.\n" +
                                "...\n" +
                                "setelah sampai, dia masih bersusah payah untuk bernapas..\n" +
                                "Petapa: \"Jawabanmu?\"");
                        break;
                }
                break;
        }
    }

    private void chapter3(String cmd, int story) {
        switch (cmd) {
            case "next":
                switch (story) {
                    case 2:
                        storyPanel.addStory("Hugo memutuskan untuk menunggu, semoga petapa itu terbangun dan mencariku dan membukakan pintu ini untukku.\n" +
                                "Setelah sekitar satu jam menunggu, obor yang ia bawa dari petapa mati, sisa obor yang ia ambil diruangan ini tadi. Ia menyalakan obor itu sembari menunggu.\n" +
                                "Tak lama ia merasa mengantuk dan hampir tertidur, tetapi ketika ia terbangun sebentar, ia melihat bayangan hitam besar, makhluk itu berada di belakangnya. Hugo tak bisa melarikan diri..");
                        ThreadGUI.objectPlayer.setGameOver();
                        break;
                    case 3:
                        storyPanel.addStory("Hugo melewati lorong dinding gua yang mengandung batu mineral indah berwarna violet. Cahaya dari obor memantul di menghasilkan pemandangan yang indah. Hugo memandang kagum sepanjang dinding lorong.\n" +
                                "Hugo : \"Indah sekali, ini seperti pemandangan di langit malam yang dipenuhi kembang api\"\n" +
                                "Hugo tertegun tanpa menyadari ada sepasang mata hitam yang memperhatikannya dari kegelapan.\n" +
                                "Hugo : \"Mungkinkah aku bisa membawa sebagian batuan ini untuk kenang-kenangan?\"");
                        break;
                    case 4:
                        storyPanel.addStory("Saat Hugo hendak mengambil sebagian kecil batu itu, sesosok monster seperti beruang dengan moncong naga keluar dari sisi tergelap sudut lorong dan mengejar Hugo. Hugo terkejut dan langsung berlari dari sana secepat mungkin.\n" +
                                "Hugo : \"Tidak, aku tidak akan mengambilnya. Jangan kejar aku!\" Hugo terus berlari menelusuri lorong. Beruntunglah monster itu tidak mengikutinya sampai sejauh ini.\n" +
                                "ia menemukan persimpangan lagi");
                        break;
                    case 5:
                        storyPanel.addStory("Jalanan dan dindinnya lebih banyak tumbuhan daripada sebelumnya, Hugo tetap melanjutkan berjalan menyusuri lorong ini.\n" +
                                "Sampak akhirnya dia bertemu dengan sekumpulan monyet, ia menghalau monyet itu tetapi mereka menjadi marah. melihat kemarahan mereka Hugo kembali sembari berlari tetapi tetap saja monyet itu lebih lincah sampai akhirnya ada 1 yang menggigit kaki Hugo, Hugo kesakitan dan terjatuh, monyet itu mengerubungi tubuhnya dan memakannya hidup-hidup.");
                        ThreadGUI.objectPlayer.setGameOver();
                        break;
                }
                break;
            case "a":
                switch (story) {
                    case 2:
                        storyPanel.addStory("Hugo berjalan menyusuri lorong itu, di ujung lorong itu dia menemui persimpangan.");
                        break;
                    case 3:
                        storyPanel.addStory("Jalan di bagian gua ini sangat berbatu, bahkan Hugo tidak bisa berdiri dengan lurus. Dinding gua dipenuhi tetesan air yang berjatuhan dan berbau seperti campuran bahan peledak. Hugo tidak sengaja menginjak batuan licin dan terjatuh.\n" +
                                "Obor yang dibawa Hugo berhenti tepat dibawah kumpulan barrel, dan BOOM!");
                        ThreadGUI.objectPlayer.setGameOver();
                        break;
                    case 4:
                        storyPanel.addStory("Hugo melanjutkan menyusuri lorong\n" +
                                "ia menemukan persimpangan lagi");
                        break;
                    case 5:
                        storyPanel.addStory("Jalanan di lorong ini sepertinya tidak berujung, Hugo tidak menemukan titik terang sama sekali... Tiba-tiba ada suara menggeram, suaranya kecil dan samar-samar." +
                                "Hugo : \"Mungkin ada seseorang di ujung sana\" Hugo melanjutkan berjalan.\n" +
                                "Suara itu semakin jelas. Hugo mulai ragu melanjutkan langkahnya.\n" +
                                "Tiba-tiba sesosok monster maju dan mengitari Hugo. Hugo dapat melihat dengan jelas, kepala serigala dengan air liur menetes di moncongnya, matanya merah seperti gumpalan darah yang menggenang. Badan monster itu besar seperti singa. Hugo mengikuti arah monster itu agar tetap berhadapan dengannya.");
                        break;
                    case 6:
                        storyPanel.addStory("Hugo panik dan memutuskan berlari mencari jalan keluar. Tapi monster itu lebih cepat, Hugo tertangkap. Monster itu memakan Hugo hingga habis tak bersisa.");
                        ThreadGUI.objectPlayer.setGameOver();


                }
                break;
            case "b":
                break;
            case "c":
                break;
        }
    }
}
