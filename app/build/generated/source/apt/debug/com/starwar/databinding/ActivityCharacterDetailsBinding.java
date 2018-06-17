package com.starwar.databinding;
import com.starwar.R;
import com.starwar.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCharacterDetailsBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.people_card, 5);
        sViewsWithIds.put(R.id.txt_name, 6);
        sViewsWithIds.put(R.id.txt_height, 7);
        sViewsWithIds.put(R.id.txt_mass, 8);
        sViewsWithIds.put(R.id.txt_date, 9);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    public final android.support.v7.widget.CardView peopleCard;
    @NonNull
    public final android.widget.TextView txtDate;
    @NonNull
    public final android.widget.TextView txtHeight;
    @NonNull
    public final android.widget.TextView txtMass;
    @NonNull
    public final android.widget.TextView txtName;
    // variables
    @Nullable
    private com.starwar.viewModel.CharacterDetailslViewModel mCharacterDetilsModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCharacterDetailsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.peopleCard = (android.support.v7.widget.CardView) bindings[5];
        this.txtDate = (android.widget.TextView) bindings[9];
        this.txtHeight = (android.widget.TextView) bindings[7];
        this.txtMass = (android.widget.TextView) bindings[8];
        this.txtName = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.characterDetilsModel == variableId) {
            setCharacterDetilsModel((com.starwar.viewModel.CharacterDetailslViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterDetilsModel(@Nullable com.starwar.viewModel.CharacterDetailslViewModel CharacterDetilsModel) {
        this.mCharacterDetilsModel = CharacterDetilsModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.characterDetilsModel);
        super.requestRebind();
    }
    @Nullable
    public com.starwar.viewModel.CharacterDetailslViewModel getCharacterDetilsModel() {
        return mCharacterDetilsModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.starwar.viewModel.CharacterDetailslViewModel characterDetilsModel = mCharacterDetilsModel;
        java.lang.String characterDetilsModelGetName = null;
        java.lang.String characterDetilsModelGetHeight = null;
        java.lang.String characterDetilsModelGetMass = null;
        java.lang.String characterDetilsModelGetDate = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (characterDetilsModel != null) {
                    // read characterDetilsModel.getName()
                    characterDetilsModelGetName = characterDetilsModel.getName();
                    // read characterDetilsModel.getHeight()
                    characterDetilsModelGetHeight = characterDetilsModel.getHeight();
                    // read characterDetilsModel.getMass()
                    characterDetilsModelGetMass = characterDetilsModel.getMass();
                    // read characterDetilsModel.getDate()
                    characterDetilsModelGetDate = characterDetilsModel.getDate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, characterDetilsModelGetName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, characterDetilsModelGetHeight);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, characterDetilsModelGetMass);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, characterDetilsModelGetDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCharacterDetailsBinding>inflate(inflater, com.starwar.R.layout.activity_character_details, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterDetailsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.starwar.R.layout.activity_character_details, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCharacterDetailsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterDetailsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_character_details_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCharacterDetailsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): characterDetilsModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}