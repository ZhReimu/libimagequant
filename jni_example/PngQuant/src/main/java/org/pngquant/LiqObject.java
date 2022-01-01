package org.pngquant;

abstract class LiqObject implements AutoCloseable {
    static {
        // libimagequant.jnilib or libimagequant.so must be in java.library.path
        System.loadLibrary("libimagequant");
    }

    long handle;

    /**
     * Free memory used by the library. The object must not be used after this call.
     */
    abstract public void close();

}
