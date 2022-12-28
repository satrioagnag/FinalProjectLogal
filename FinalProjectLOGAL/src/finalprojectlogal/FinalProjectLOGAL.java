package finalprojectlogal;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Diablo Scar
 */
public class FinalProjectLOGAL {

    static int idx = 0;
    static String[] countries = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Vatican", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};

    static String[] mFind(String[] countries, String guess) {
        String[] hasil = new String[countries.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].contains(guess)) {
                hasil[idx] = countries[i];

            }

        }
        idx++;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Mode = 0, point = 0, index = 0, coba = 0;
        System.out.println("Selamat Datang di Game ABC 5 Dasar Tebak Negara!");

        do {
            System.out.println("=========================================================");
            System.out.println("1. Mulai Game\n2. Cek skor\n3. How to Play\n4. Exit");
            System.out.println("Masukkan input anda: (berupa angka)");
            Mode = input.nextInt();
            switch (Mode) {
                case 1:
                    Random r = new Random();
                    char c = (char) (r.nextInt(26) + 'a');
                    System.out.println("Tebak negara dengan abjad awal " + c);
                    System.out.println("Masukkan tebakan anda:");
                    String guess = input.next();
                    String[] ResultFind = mFind(countries, guess);
                    if (ResultFind[index] != null) {
                        System.out.println("Selamat, anda benar! *+5poin");
                        point += 5;
                    } else {
                        System.out.println("Salah, coba lain kali");
                    }
                    index++;
                    System.out.println("================");

                    break;
                case 2:
                    System.out.println("Skor anda : " + point);
                    break;
                case 3:
                    System.out.println("==================");
                    System.out.println("Tata cara bermain ABC 5 Dasar Negara");
                    System.out.println("1. Pemain memasukkan input dengan huruf kapital\n2. Pemain memasukkan input dengan format nama negara berbahasa inggris"
                            + "(Contoh : Japan / Yemen)");
                    break;
            }
        } while (Mode != 4);
        System.out.println("Exiting program...");
    }
}
