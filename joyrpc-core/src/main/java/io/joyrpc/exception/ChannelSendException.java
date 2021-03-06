package io.joyrpc.exception;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * 发送异常
 */
public class ChannelSendException extends TransportException {

    public ChannelSendException() {
    }

    public ChannelSendException(String message) {
        super(message);
    }

    public ChannelSendException(String message, String errorCode) {
        super(message, errorCode);
    }

    public ChannelSendException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChannelSendException(String message, Throwable cause, String errorCode) {
        super(message, cause, errorCode);
    }

    public ChannelSendException(Throwable cause) {
        super(cause);
    }

    public ChannelSendException(Throwable cause, String errorCode) {
        super(cause, errorCode);
    }

    @Override
    public boolean isRetry() {
        return true;
    }
}
