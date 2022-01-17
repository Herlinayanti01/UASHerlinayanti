package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Monyet;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.Angora_nama),ctx.getString(R.string.Angora_asal),
                ctx.getString(R.string.Angora_deskripsi),R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.Bengal_nama),ctx.getString(R.string.Bengal_asal),
                ctx.getString(R.string.Bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.Birmani_nama),ctx.getString(R.string.Birmani_asal),
                ctx.getString(R.string.Birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.Persia_nama),ctx.getString(R.string.Persia_asal),
                ctx.getString(R.string.Persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.Siam_nama),ctx.getString(R.string.Siam_asal),
                ctx.getString(R.string.Siam_deskripsi), R.drawable.cat_siam));

        return kucings;
    }


    private static List<Anjing>initDataAnjing(Context ctx) {
        List<Anjing> anjings= new ArrayList<>();
       anjings.add(new Anjing(ctx.getString(R.string.Bulldog_nama), ctx.getString(R.string.Bulldog_asal),
                ctx.getString(R.string.Bulldog_deskripsi),R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.Husky_nama), ctx.getString(R.string.Husky_asal),
                ctx.getString(R.string.Husky_deskripsi),R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.Kintamani_nama), ctx.getString(R.string.Kintamani_asal),
                ctx.getString(R.string.Kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.Samoyed_nama), ctx.getString(R.string.Samoyed_asal),
                ctx.getString(R.string.Samoyed_deskripsi), R.drawable.dog_samoyed));
        return anjings;
    }
    private static List<Monyet> initDataMonyet(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet(ctx.getString(R.string.monyet_bekantan_nama),ctx.getString(R.string.monyet_bekantan_asal),
                ctx.getString(R.string.monyet_bekantan_deskripsi), R.drawable.monyet_bekantan));
        monyets.add(new Monyet(ctx.getString(R.string.monyet_owa_jawa_nama),ctx.getString(R.string.monyet_owa_jawa_asal),
                ctx.getString(R.string.monyet_owa_jawa_deskripsi), R.drawable.monyet_owa_jawa));
        monyets.add(new Monyet(ctx.getString(R.string.monyet_daun_natuna_nama),ctx.getString(R.string.monyet_daun_natuna_asal),
                ctx.getString(R.string.monyet_daun_natuna_deskripsi), R.drawable.monyet_daun_natuna));
        monyets.add(new Monyet(ctx.getString(R.string.monyet_tarsisus_kecil_nama),ctx.getString(R.string.monyet_tarsisus_kecil_asal),
                ctx.getString(R.string.monyet_tarsisus_kecil_deskripsi), R.drawable.monyet_tarsius_kecil));
        return monyets;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataMonyet(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}