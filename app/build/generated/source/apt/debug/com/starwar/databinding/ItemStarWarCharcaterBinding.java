package com.starwar.databinding;
import com.starwar.R;
import com.starwar.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStarWarCharcaterBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.support.v7.widget.CardView itemCharacter;
    @NonNull
    public final android.widget.TextView labelName;
    // variables
    @Nullable
    private com.starwar.viewModel.ItemCharacterViewModel mCharacterViewModel;
    // values
    // listeners
    private OnClickListenerImpl mCharacterViewModelOnItemClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemStarWarCharcaterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.itemCharacter = (android.support.v7.widget.CardView) bindings[0];
        this.itemCharacter.setTag(null);
        this.labelName = (android.widget.TextView) bindings[1];
        this.labelName.setTag(null);
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
        if (BR.characterViewModel == variableId) {
            setCharacterViewModel((com.starwar.viewModel.ItemCharacterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterViewModel(@Nullable com.starwar.viewModel.ItemCharacterViewModel CharacterViewModel) {
        updateRegistration(0, CharacterViewModel);
        this.mCharacterViewModel = CharacterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.characterViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.starwar.viewModel.ItemCharacterViewModel getCharacterViewModel() {
        return mCharacterViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCharacterViewModel((com.starwar.viewModel.ItemCharacterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCharacterViewModel(com.starwar.viewModel.ItemCharacterViewModel CharacterViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.starwar.viewModel.ItemCharacterViewModel characterViewModel = mCharacterViewModel;
        android.view.View.OnClickListener characterViewModelOnItemClickAndroidViewViewOnClickListener = null;
        java.lang.String characterViewModelGetName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (characterViewModel != null) {
                    // read characterViewModel::onItemClick
                    characterViewModelOnItemClickAndroidViewViewOnClickListener = (((mCharacterViewModelOnItemClickAndroidViewViewOnClickListener == null) ? (mCharacterViewModelOnItemClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mCharacterViewModelOnItemClickAndroidViewViewOnClickListener).setValue(characterViewModel));
                    // read characterViewModel.getName()
                    characterViewModelGetName = characterViewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.itemCharacter.setOnClickListener(characterViewModelOnItemClickAndroidViewViewOnClickListener);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.labelName, characterViewModelGetName);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.starwar.viewModel.ItemCharacterViewModel value;
        public OnClickListenerImpl setValue(com.starwar.viewModel.ItemCharacterViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemStarWarCharcaterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemStarWarCharcaterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemStarWarCharcaterBinding>inflate(inflater, com.starwar.R.layout.item_star_war_charcater, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemStarWarCharcaterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemStarWarCharcaterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.starwar.R.layout.item_star_war_charcater, null, false), bindingComponent);
    }
    @NonNull
    public static ItemStarWarCharcaterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemStarWarCharcaterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_star_war_charcater_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemStarWarCharcaterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): characterViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}