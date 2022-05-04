import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, iban = "";
        int right = 3;
        int bakiye = 1000;
        int choice, yatirilacakHesapSecimi, yatirilacakTutar = 0, accept, cekilecekTutar = 0, paraCekmeSecimi;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();

            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("atmaca") && password.equals("123456")) {
                System.out.println("Sisteme Giriş Yaptınız.");
                System.out.println("Atmaca Bankasına hoşgeldiniz.");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Yatırılacak hesap seçiniz...\n1-Kendi Hesabıma\n2-Başkasının Hesabına");
                        yatirilacakHesapSecimi = input.nextInt();
                        switch (yatirilacakHesapSecimi) {
                            case 1:
                                while (yatirilacakTutar <= 0) {
                                    System.out.println("Ne kadar yatırılacak?");
                                    yatirilacakTutar = input.nextInt();
                                    if (yatirilacakTutar > 0) {
                                        System.out.println("Hesabınıza " + yatirilacakTutar + " TL yatırıldı.");
                                        bakiye += yatirilacakTutar;
                                        System.out.println("Başka işlem yapmak istiyor musunuz?\n1-Evet\n2-Hayır");
                                    } else {
                                        System.out.println("Yatırılacak tutar 0 TL veya daha az olamaz!. Tekrar deneyiniz.");
                                    }
                                }
                                break;
                            case 2:
                                while (yatirilacakTutar <= 0) {
                                    System.out.println("Ne kadar yatırılacak?");
                                    yatirilacakTutar = input.nextInt();
                                    if(yatirilacakTutar > bakiye){
                                        while (iban.length() < 26) {
                                            System.out.println("IBAN numarasını giriniz.");
                                            iban = input.nextLine();
                                            if (iban.length() >= 26) {
                                                System.out.println(iban + " hesabına " + yatirilacakTutar + " TL yatırılacaktır. Kabul ediyor musunuz?\n1-Evet\n2-Hayır");
                                                accept = input.nextInt();
                                                switch (accept) {
                                                    case 1:
                                                        System.out.println("Paranız yatırıldı.");
                                                        bakiye -= yatirilacakTutar;
                                                        break;
                                                    case 2:
                                                        System.out.println("Para yatırılmaktan vazgeçildi.");
                                                        break;
                                                }
                                            }

                                        }
                                    }else{
                                        System.out.println("Bakiye yetersiz!!");
                                    }
                                }
                        }

                        break;
                    case 2:
                        System.out.println("Ne kadar çekmek istiyorsunuz?\n1-100 TL\n2-250 TL\n3-500 TL\n4-1000 TL\n5-Diğer\n6-İptal");
                        paraCekmeSecimi = input.nextInt();
                        switch (paraCekmeSecimi) {
                            case 1:
                                System.out.print("Hesabınından 100 TL çekildi.");
                                bakiye -= 100;
                                break;
                            case 2:
                                System.out.print("Hesabınından 250 TL çekildi.");
                                bakiye -= 250;
                                break;
                            case 3:
                                System.out.print("Hesabınından 500 TL çekildi.");
                                bakiye -= 500;
                                break;
                            case 5:
                                while (cekilecekTutar <= 0) {
                                    System.out.println("Tutar giriniz...");
                                    cekilecekTutar = input.nextInt();
                                    if (cekilecekTutar > 0) {
                                        System.out.print("Hesabınızdan " + cekilecekTutar + " TL çekildi.");
                                        bakiye -= cekilecekTutar;
                                    } else {
                                        System.out.println("Tutar 0 TL veya daha az olamaz! Tekrar deneyiniz...");
                                    }
                                }
                                break;
                            case 6:
                                System.out.print("Para çekme işlemi iptal edildi.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.print("Hesabınızda "+bakiye+" TL bulunmaktadır.");
                        break;
                    case 4:
                        System.out.print("Çıkış Yapıldı");
                        break;
                }
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("3 kere yanlış denediğiniz için hesabınız bloke olmuştur. Banka ile iletişime geçmelisiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }

    }
}