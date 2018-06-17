
package android.databinding;
import com.starwar.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.starwar.R.layout.activity_character:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_character_0".equals(tag)) {
                            return new com.starwar.databinding.ActivityCharacterBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_character is invalid. Received: " + tag);
                }
                case com.starwar.R.layout.item_star_war_charcater:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_star_war_charcater_0".equals(tag)) {
                            return new com.starwar.databinding.ItemStarWarCharcaterBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_star_war_charcater is invalid. Received: " + tag);
                }
                case com.starwar.R.layout.activity_character_details:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_character_details_0".equals(tag)) {
                            return new com.starwar.databinding.ActivityCharacterDetailsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_character_details is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 70281519: {
                if(tag.equals("layout/activity_character_0")) {
                    return com.starwar.R.layout.activity_character;
                }
                break;
            }
            case -962493919: {
                if(tag.equals("layout/item_star_war_charcater_0")) {
                    return com.starwar.R.layout.item_star_war_charcater;
                }
                break;
            }
            case -606572686: {
                if(tag.equals("layout/activity_character_details_0")) {
                    return com.starwar.R.layout.activity_character_details;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"characterDetilsModel"
            ,"characterViewModel"};
    }
}