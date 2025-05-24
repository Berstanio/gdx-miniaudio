package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_vtable;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_decoding_backend_vtable_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_config;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;

public final class ma_decoding_backend_vtable extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(107).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_decoding_backend_vtable(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_decoding_backend_vtable(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_decoding_backend_vtable() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer asPointer() {
        return new ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_decoding_backend_vtable.onInit> onInit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_decoding_backend_vtable_Internal.onInit_Internal::onInit_downcall);
    }

    public void onInit(ClosureObject<ma_decoding_backend_vtable.onInit> onInit) {
        getBufPtr().setNativePointer(0, onInit.getPointer());
    }

    public ClosureObject<ma_decoding_backend_vtable.onInitFile> onInitFile() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_decoding_backend_vtable_Internal.onInitFile_Internal::onInitFile_downcall);
    }

    public void onInitFile(ClosureObject<ma_decoding_backend_vtable.onInitFile> onInitFile) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onInitFile.getPointer());
    }

    public ClosureObject<ma_decoding_backend_vtable.onInitFileW> onInitFileW() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_decoding_backend_vtable_Internal.onInitFileW_Internal::onInitFileW_downcall);
    }

    public void onInitFileW(ClosureObject<ma_decoding_backend_vtable.onInitFileW> onInitFileW) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onInitFileW.getPointer());
    }

    public ClosureObject<ma_decoding_backend_vtable.onInitMemory> onInitMemory() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_decoding_backend_vtable_Internal.onInitMemory_Internal::onInitMemory_downcall);
    }

    public void onInitMemory(ClosureObject<ma_decoding_backend_vtable.onInitMemory> onInitMemory) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onInitMemory.getPointer());
    }

    public ClosureObject<ma_decoding_backend_vtable.onUninit> onUninit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), ma_decoding_backend_vtable_Internal.onUninit_Internal::onUninit_downcall);
    }

    public void onUninit(ClosureObject<ma_decoding_backend_vtable.onUninit> onUninit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, onUninit.getPointer());
    }

    public static final class ma_decoding_backend_vtablePointer extends StackElementPointer<ma_decoding_backend_vtable> {

        public ma_decoding_backend_vtablePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_decoding_backend_vtablePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_decoding_backend_vtablePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_decoding_backend_vtablePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_decoding_backend_vtablePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_decoding_backend_vtablePointer() {
            this(1, true);
        }

        public ma_decoding_backend_vtablePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_decoding_backend_vtable createStackElement(long ptr, boolean freeOnGC) {
            return new ma_decoding_backend_vtable(ptr, freeOnGC);
        }
    }

    public interface onInit extends Closure, ma_decoding_backend_vtable_Internal.onInit_Internal {

        ma_result onInit_call(VoidPointer pUserData, ClosureObject<GdxMiniaudio.ma_read_proc> onRead, ClosureObject<GdxMiniaudio.ma_seek_proc> onSeek, ClosureObject<GdxMiniaudio.ma_tell_proc> onTell, VoidPointer pReadSeekTellUserData, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);
    }

    public interface onInitFile extends Closure, ma_decoding_backend_vtable_Internal.onInitFile_Internal {

        ma_result onInitFile_call(VoidPointer pUserData, BytePointer pFilePath, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);
    }

    public interface onInitFileW extends Closure, ma_decoding_backend_vtable_Internal.onInitFileW_Internal {

        ma_result onInitFileW_call(VoidPointer pUserData, SIntPointer pFilePath, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);
    }

    public interface onInitMemory extends Closure, ma_decoding_backend_vtable_Internal.onInitMemory_Internal {

        ma_result onInitMemory_call(VoidPointer pUserData, VoidPointer pData, long dataSize, ma_decoding_backend_config.ma_decoding_backend_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<VoidPointer> ppBackend);
    }

    public interface onUninit extends Closure, ma_decoding_backend_vtable_Internal.onUninit_Internal {

        void onUninit_call(VoidPointer pUserData, VoidPointer pBackend, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks);
    }
}
