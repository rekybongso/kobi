package com.rekybongso.kobi.data

import com.rekybongso.kobi.R
import com.rekybongso.kobi.model.BankModel

object BankData {
    private var bankData = arrayOf(
        arrayOf(
            "Bank Rakyat Indonesia (BRI)",
            "002",
            "BRINIDJA",
            "Gedung BRI\n" +
                    "Jl. Jenderal Sudirman Kav.44-46\n" +
                    "Jakarta 10210\n" +
                    "Indonesia",
            "14017",
            "https://bri.co.id/",
            R.drawable.bri
        ),
        arrayOf(
            "Bank Central Asia (BCA)",
            "014",
            "CENAIDJA",
            "Menara BCA, Grand Indonesia \n" +
                    "Jl. MH Thamrin No. 1 \n" +
                    "Jakarta 10310\n" +
                    "Indonesia",
            "02123588000",
            "https://www.bca.co.id/",
            R.drawable.bca
        ),
        arrayOf(
            "Bank Mandiri",
            "008",
            "BMRIIDJA",
            "Jl. Jenderal Gatot Subroto Kav. 36-38 \n" +
                    "Jakarta 12190\n" +
                    "Indonesia",
            "02152997777",
            "https://www.bankmandiri.co.id/",
            R.drawable.mandiri
        ),
        arrayOf(
            "Bank Negara Indonesia (BNI)",
            "009",
            "BNINIDJA",
            "Gedung Graha BNI\n" +
                    "Jl. Jenderal Sudirman Kav. 1\n" +
                    "Jakarta Pusat 10220\n" +
                    "Indonesia",
            "0212511946",
            "https://www.bni.co.id/id-id/",
            R.drawable.bni
        ),
        arrayOf(
            "Bank CIMB Niaga",
            "022",
            "BNIAIDJA",
            "Graha CIMB Niaga\n" +
                    "Jl. Jend Sudirman Kav. 58\n" +
                    "Jakarta 12190 \n" +
                    "Indonesia",
            "14041",
            "https://www.cimbniaga.co.id/",
            R.drawable.cimb
        ),
        arrayOf(
            "Bank Muamalat",
            "147",
            "MUABIDJA",
            "Muamalat Tower\n" +
                    "Jl. Prof Dr Satrio, Kav. 18\n" +
                    "Kuningan Timur, Setiabudi\n" +
                    "Jakarta Selatan 12940\n" +
                    "Indonesia",
            "0218066000",
            "https://www.bankmuamalat.co.id/",
            R.drawable.muamalat
        ),
        arrayOf(
            "Bank Tabungan Pensiunan Nasional (BTPN)",
            "213",
            "BTPNIDJA",
            "Menara BTPN - CBD Mega Kuningan\n" +
                    "Jl. Dr. Ide Anak Agung Gde Agung Kav 5.5 - 5.6\n" +
                    "Jakarta 12950\n" +
                    "Indonesia",
            "1500300",
            "https://www.btpn.com/",
            R.drawable.btpn
        ),
        arrayOf(
            "Bank Tabungan Negara (BTN)",
            "200",
            "BTANIDJA",
            "Menara Bank BTN\n" +
                    "Jl. Gajah Mada No. 1\n" +
                    "Jakarta 10130\n" +
                    "Indonesia",
            "0216336789",
            "https://www.btn.co.id/",
            R.drawable.btn
        ),
        arrayOf(
            "Bank Permata",
            "013",
            "BBBAIDJA",
            "Gedung World Trade Center II (WTC II) Lt.21-30\n" +
                    "Jl. Jend. Sudirman Kav. 29 - 31\n" + "" +
                    "Jakarta 12920\n" +
                    "Indonesia",
            "02177289928",
            "https://www.permatabank.com/",
            R.drawable.permata
        ),
        arrayOf(
            "Bank Danamon",
            "011",
            "BDINIDJA",
            "Jl. HR. Rasuna Said Blok C No. 10\n" +
                    "Jakarta 12920\n" +
                    "Indonesia",
            "1500090",
            "https://www.danamon.co.id/",
            R.drawable.danamon
        ),
        arrayOf(
            "Bank Mega",
            "426",
            "MEGAIDJA",
            "Menara Bank Mega 15th Floor\n" +
                    "Jl. Kapten P. Tendean No.12-14A\n" +
                    "Jakarta 12790\n" +
                    "Indonesia",
            "1500010",
            "https://www.bankmega.com/",
            R.drawable.mega
        ),
        arrayOf(
            "Bank Maybank Indonesia",
            "016",
            "IBBKIDJA",
            "Gedung Sentral Senayan 3 Ground Floor \n" +
                    "Jl. Asia Afrika 8, Gelora Bung Karno, Senayan\n" +
                    "Jakarta Pusat 10270\n" +
                    "Indonesia",
            "1500611",
            "https://www.maybank.co.id/",
            R.drawable.maybank
        ),
        arrayOf(
            "Bank Sinarmas",
            "153",
            "SBJKIDJA",
            "Sinar Mas Land Plaza\n" +
                    "Jl. M.H Thamrin kav 51,\n" +
                    "Menara 1, Lantai 1 & 2,\n" +
                    "Jakarta 10350\n" +
                    "Indonesia",
            "1500153",
            "https://www.banksinarmas.com/",
            R.drawable.sinarmas
        ),
        arrayOf(
            "Bank Commonwealth",
            "950",
            "BICNIDJA",
            "World Trade Centre (WTC) 6, 3A Floor\n" +
                    "Jl. Jenderal Sudirman Kav 29-31\n" +
                    "Jakarta 12920\n" +
                    "Indonesia",
            "1500030",
            "https://www.commbank.co.id/",
            R.drawable.cmw
        ),
        arrayOf(
            "Bank OCBC NISP",
            "028",
            "OCBCIDJA",
            "OCBC NISP Tower\n" +
                    "Jl. Prof. Dr. Satrio Kav. 25\n" +
                    "Jakarta 12940\n" +
                    "Indonesia",
            "1500999",
            "https://www.ocbcnisp.com/",
            R.drawable.ocbc
        ),
        arrayOf(
            "Bank Bukopin",
            "441",
            "BBUKIDJA",
            "Jl. MT. Haryono Kav. 50-51\n" +
                    "Jakarta 12770\n" +
                    "Indonesia",
            "0217988266",
            "https://www.bukopin.co.id/",
            R.drawable.bukopin
        )
    )

    val listBank: ArrayList<BankModel>
    get() {
        val list = arrayListOf<BankModel>()
        for (n in bankData) {
            val bank = BankModel()
            bank.namaBank = n[0] as String
            bank.kodeBank = n[1] as String
            bank.swiftBank = n[2] as String
            bank.alamatBank = n[3] as String
            bank.teleponBank = n[4] as String
            bank.websiteBank = n[5] as String
            bank.logoBank = n[6] as Int

            list.add(bank)
        }
        return list
    }
}