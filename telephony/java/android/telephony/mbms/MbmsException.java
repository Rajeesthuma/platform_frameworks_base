/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package android.telephony.mbms;

/** @hide */
public class MbmsException extends Exception {
    public static final int SUCCESS = 0;
    public static final int ERROR_NO_SERVICE_INSTALLED = 1;
    public static final int ERROR_MULTIPLE_SERVICES_INSTALLED = 2;
    public static final int ERROR_BIND_TIMEOUT_OR_FAILURE = 3;
    public static final int ERROR_UNKNOWN_REMOTE_EXCEPTION = 4;
    public static final int ERROR_ALREADY_INITIALIZED = 5;
    public static final int ERROR_CONCURRENT_SERVICE_LIMIT_REACHED = 6;
    public static final int ERROR_MIDDLEWARE_NOT_BOUND = 7;
    public static final int ERROR_UNABLE_TO_START_SERVICE = 8;
    public static final int ERROR_STREAM_ALREADY_STARTED = 9;
    public static final int ERROR_END_OF_SESSION = 10;

    private final int mErrorCode;

    /** @hide
     * TODO: future systemapi
     */
    public MbmsException(int errorCode) {
        super();
        mErrorCode = errorCode;
    }

    public int getErrorCode() {
        return mErrorCode;
    }
}
