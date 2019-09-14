/*
 * Created by Michael Carrara <michael.carrara@breadwallet.com> on 5/31/18.
 * Copyright (c) 2018-2019 Breadwinner AG.  All right reserved.
 *
 * See the LICENSE file at the project root for license information.
 * See the CONTRIBUTORS file at the project root for a list of contributors.
 */
package com.breadwallet.crypto.events.walletmanager;

public final class WalletManagerCreatedEvent implements WalletManagerEvent {

    @Override
    public <T> T accept(WalletManagerEventVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
