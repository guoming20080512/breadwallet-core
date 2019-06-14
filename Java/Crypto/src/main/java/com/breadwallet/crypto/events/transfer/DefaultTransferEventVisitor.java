/*
 * Created by Michael Carrara <michael.carrara@breadwallet.com> on 5/31/18.
 * Copyright (c) 2018 Breadwinner AG.  All right reserved.
 *
 * See the LICENSE file at the project root for license information.
 * See the CONTRIBUTORS file at the project root for a list of contributors.
 */
package com.breadwallet.crypto.events.transfer;

import android.support.annotation.Nullable;

public abstract class DefaultTransferEventVisitor<T> implements TransferEventVisitor<T> {

    @Nullable
    public T visit(TransferChangedEvent event) {
        return null;
    }

    @Nullable
    public T visit(TransferConfirmationEvent event) {
        return null;
    }

    @Nullable
    public T visit(TransferCreatedEvent event) {
        return null;
    }

    @Nullable
    public T visit(TransferDeletedEvent event) {
        return null;
    }
}
