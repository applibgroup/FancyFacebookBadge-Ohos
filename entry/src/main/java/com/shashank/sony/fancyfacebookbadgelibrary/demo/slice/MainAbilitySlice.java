/*
 * Copyright (C) 2020-21 Application Library Engineering Group
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
 * limitations under the License.
 */

package com.shashank.sony.fancyfacebookbadgelibrary.demo.slice;

import com.shashank.sony.fancyfacebookbadgelib.Emoji;
import com.shashank.sony.fancyfacebookbadgelib.FacebookNotificationBadge;
import com.shashank.sony.fancyfacebookbadgelibrary.demo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class MainAbilitySlice extends AbilitySlice {

    private int mCount = 0;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        final FacebookNotificationBadge mBadge = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge);
        final FacebookNotificationBadge mBadge1 = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge1);
        final FacebookNotificationBadge mBadge2 = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge2);
        final FacebookNotificationBadge mBadge3 = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge3);
        final FacebookNotificationBadge mBadge4 = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge4);
        final FacebookNotificationBadge mBadge5 = (FacebookNotificationBadge) findComponentById(ResourceTable.Id_badge5);
        mBadge.setEmoji(Emoji.HAHA);
        mBadge1.setEmoji(Emoji.LIKE);
        mBadge2.setEmoji(Emoji.LOVE);
        mBadge3.setEmoji(Emoji.WOW);
        mBadge4.setEmoji(Emoji.SAD);
        mBadge5.setEmoji(Emoji.ANGRY);
        Button increase = (Button) findComponentById(ResourceTable.Id_button1);
        increase.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                ++mCount;
                mBadge.setNumber(mCount);
                mBadge1.setNumber(mCount);
                mBadge2.setNumber(mCount);
                mBadge3.setNumber(mCount);
                mBadge4.setNumber(mCount);
                mBadge5.setNumber(mCount);
            }
        });
        Button clear = (Button) findComponentById(ResourceTable.Id_button2);
        clear.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                mCount = 0;
                mBadge.setNumber(mCount);
                mBadge1.setNumber(mCount);
                mBadge2.setNumber(mCount);
                mBadge3.setNumber(mCount);
                mBadge4.setNumber(mCount);
                mBadge5.setNumber(mCount);  }
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
