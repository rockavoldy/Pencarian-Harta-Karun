public class Chapter {
    private int chapter;
    private String fisik = "";
    private String sihir = "";
    private String skillAmbil = "";
    private int randPoint = (int) (Math.random() * 16) + 5;
    private int randStats = randPoint;
    private int randHP = randPoint;
    private int randMP = randPoint;
    private int randSTR = (int) (Math.random() * 7) + 3;
    private int randVIT = (int) (Math.random() * 7) + 3;
    private int randINT = (int) (Math.random() * 6) + 3;
    private int randAGI = (int) (Math.random() * 5) + 3;
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
                        Player.setGameOver();
                        break;
                    case 6:
                        randStats = (int) (Math.random() * 4) + 1;
                        switch (randStats) {
                            case 1:
                                fisik = "Hugo mendapat sebuah Sword dengan memberikan tambahan Health Point sebesar "+randHP;
                                Player.addMaxHP(randHP);
                                Player.usedSenjata = "Sword";
                                break;
                            case 2:
                                fisik = "Hugo mendapat sebuah Axe dengan memberikan tambahan stats STR sebesar "+randSTR;
                                Player.addStats(1, randSTR);
                                Player.usedSenjata = "Axe";
                                break;
                            case 3:
                                fisik = "Hugo mendapat sebuah Double Sword dengan memberikan tambahan stats INT sebesar "+randINT;
                                Player.addStats(2, randINT);
                                Player.usedSenjata = "Double Sword";
                                break;
                            case 4:
                                fisik = "Hugo mendapat sebuah Dagger dengan memberikan tambahan stats INT sebesar "+randAGI;
                                Player.addStats(3, randAGI);
                                Player.usedSenjata = "Dagger";
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
                        randStats = (int) (Math.random() * 4) + 1;
                        switch (randStats) {
                            case 1:
                                sihir = "Hugo mendapat sebuah Staff dengan memberikan tambahan Mana Point sebesar "+randMP;
                                Player.addMaxMP(randMP);
                                Player.usedSenjata = "Staff";
                                break;
                            case 2:
                                sihir = "Hugo mendapat sebuah Wheel dengan memberikan tambahan stats VIT sebesar "+randVIT;
                                Player.addStats(0, randVIT);
                                Player.usedSenjata = "Wheel";
                                break;
                            case 3:
                                sihir = "Hugo mendapat sebuah Long Staff dengan memberikan tambahan stats STR sebesar "+randSTR;
                                Player.addStats(1, randSTR);
                                Player.usedSenjata = "Staff";
                                break;
                            case 4:
                                sihir = "Hugo mendapat sebuah Magic Chalk dengan memberikan tambahan stats AGI sebesar "+randAGI;
                                Player.addStats(3, randAGI);
                                Player.usedSenjata = "Magic Chalk";
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
                        break;
                }
                break;

            case "a":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Apa itu sebuah gua? sepertinya aku bisa pergi kesana untuk berlindung dari hujan. Tak ada tempat lain lagi yang bisa aku pakai untuk berteduh..\nSsebaiknya aku berlari sebelum hujan turun..\"");
                        break;
                }
                break;

            case "b":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Hanya ada hutan di timur. Akan terlalu berbahaya sepertinya jika hujan turun.\"");
                        storyPanel.tahapStory = 1;
                        break;
                }
                break;

            case "c":
                switch (story) {
                    case 2:
                        storyPanel.addStory("\"Tak ada apapun di arah ini, hanya hamparan padang rumput yang hijau, aku ingin menikmati ini andai saja gak mendung.\"");
                        storyPanel.tahapStory = 1;
                        break;
                }
                break;
        }
    }
}
