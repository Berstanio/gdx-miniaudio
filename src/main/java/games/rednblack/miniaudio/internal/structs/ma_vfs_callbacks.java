package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_vfs_callbacks;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_vfs_callbacks_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.ULongPointer;
import games.rednblack.miniaudio.internal.enums.ma_seek_origin;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SInt64Pointer;
import games.rednblack.miniaudio.internal.structs.ma_file_info;

public final class ma_vfs_callbacks extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(221).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_vfs_callbacks(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_vfs_callbacks(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_vfs_callbacks() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_vfs_callbacks.ma_vfs_callbacksPointer asPointer() {
        return new ma_vfs_callbacks.ma_vfs_callbacksPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_vfs_callbacks.ma_vfs_callbacksPointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_vfs_callbacks.onOpen> onOpen() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_vfs_callbacks_Internal.onOpen_Internal::onOpen_downcall);
    }

    public void onOpen(ClosureObject<ma_vfs_callbacks.onOpen> onOpen) {
        getBufPtr().setNativePointer(0, onOpen.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onOpenW> onOpenW() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_vfs_callbacks_Internal.onOpenW_Internal::onOpenW_downcall);
    }

    public void onOpenW(ClosureObject<ma_vfs_callbacks.onOpenW> onOpenW) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onOpenW.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onClose> onClose() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_vfs_callbacks_Internal.onClose_Internal::onClose_downcall);
    }

    public void onClose(ClosureObject<ma_vfs_callbacks.onClose> onClose) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onClose.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onRead> onRead() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_vfs_callbacks_Internal.onRead_Internal::onRead_downcall);
    }

    public void onRead(ClosureObject<ma_vfs_callbacks.onRead> onRead) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onRead.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onWrite> onWrite() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), ma_vfs_callbacks_Internal.onWrite_Internal::onWrite_downcall);
    }

    public void onWrite(ClosureObject<ma_vfs_callbacks.onWrite> onWrite) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, onWrite.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onSeek> onSeek() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), ma_vfs_callbacks_Internal.onSeek_Internal::onSeek_downcall);
    }

    public void onSeek(ClosureObject<ma_vfs_callbacks.onSeek> onSeek) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, onSeek.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onTell> onTell() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), ma_vfs_callbacks_Internal.onTell_Internal::onTell_downcall);
    }

    public void onTell(ClosureObject<ma_vfs_callbacks.onTell> onTell) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, onTell.getPointer());
    }

    public ClosureObject<ma_vfs_callbacks.onInfo> onInfo() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 28), ma_vfs_callbacks_Internal.onInfo_Internal::onInfo_downcall);
    }

    public void onInfo(ClosureObject<ma_vfs_callbacks.onInfo> onInfo) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 28, onInfo.getPointer());
    }

    public static final class ma_vfs_callbacksPointer extends StackElementPointer<ma_vfs_callbacks> {

        public ma_vfs_callbacksPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_vfs_callbacksPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_vfs_callbacksPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_vfs_callbacksPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_vfs_callbacksPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_vfs_callbacksPointer() {
            this(1, true);
        }

        public ma_vfs_callbacksPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_vfs_callbacks createStackElement(long ptr, boolean freeOnGC) {
            return new ma_vfs_callbacks(ptr, freeOnGC);
        }
    }

    public interface onOpen extends Closure, ma_vfs_callbacks_Internal.onOpen_Internal {

        ma_result onOpen_call(VoidPointer pVFS, BytePointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile);
    }

    public interface onOpenW extends Closure, ma_vfs_callbacks_Internal.onOpenW_Internal {

        ma_result onOpenW_call(VoidPointer pVFS, SIntPointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile);
    }

    public interface onClose extends Closure, ma_vfs_callbacks_Internal.onClose_Internal {

        ma_result onClose_call(VoidPointer pVFS, VoidPointer file);
    }

    public interface onRead extends Closure, ma_vfs_callbacks_Internal.onRead_Internal {

        ma_result onRead_call(VoidPointer pVFS, VoidPointer file, VoidPointer pDst, long sizeInBytes, ULongPointer pBytesRead);
    }

    public interface onWrite extends Closure, ma_vfs_callbacks_Internal.onWrite_Internal {

        ma_result onWrite_call(VoidPointer pVFS, VoidPointer file, VoidPointer pSrc, long sizeInBytes, ULongPointer pBytesWritten);
    }

    public interface onSeek extends Closure, ma_vfs_callbacks_Internal.onSeek_Internal {

        ma_result onSeek_call(VoidPointer pVFS, VoidPointer file, long offset, ma_seek_origin origin);
    }

    public interface onTell extends Closure, ma_vfs_callbacks_Internal.onTell_Internal {

        ma_result onTell_call(VoidPointer pVFS, VoidPointer file, SInt64Pointer pCursor);
    }

    public interface onInfo extends Closure, ma_vfs_callbacks_Internal.onInfo_Internal {

        ma_result onInfo_call(VoidPointer pVFS, VoidPointer file, ma_file_info.ma_file_infoPointer pInfo);
    }
}
