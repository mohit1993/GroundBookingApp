package app.prajeet.com.groundbooking;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class FractionUtils {

    DisplayMetrics dm;

    private FractionUtils() {
        initDisplayMatrics();
    }

    private static class FractionUtilsHolder {
        static final FractionUtils instance = new FractionUtils();

        private FractionUtilsHolder() {
        }
    }

    public static FractionUtils getInstance() {
        return FractionUtilsHolder.instance;
    }

    public int getFractionValueForHeight(Context context, int res) {
        return (int) context.getResources().getFraction(res, dm.heightPixels, dm.heightPixels);
    }

    public int getFractionValueForWidth(Context context, int res) {
        return (int) context.getResources().getFraction(res, dm.widthPixels, dm.widthPixels);
    }

    private void initDisplayMatrics(){
        dm = Resources.getSystem().getDisplayMetrics();
    }
}
