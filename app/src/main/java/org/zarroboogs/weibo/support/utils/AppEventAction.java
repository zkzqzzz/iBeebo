
package org.zarroboogs.weibo.support.utils;

import android.content.IntentFilter;

import org.zarroboogs.weibo.bean.MessageBean;

public class AppEventAction {
    // use ordered broadcast to decide to use which method to show new message
    // notification,
    // Android notification bar or Weiciyuan activity if user has opened this
    // app,
    // activity can interrupt this broadcast
    // Must equal AndroidManifest's
    // .othercomponent.unreadnotification.UnreadMsgReceiver action name
    public static final String UnRead_Message_Action = "org.zarroboogs.weibo.UnReadMessageAction";

    // mentions weibo, mentions comment, comments to me fragment use this
    // broadcast to receive actual data
    public static final String NEW_MSG_BROADCAST = "org.zarroboogs.weibo.newmsg";

    public static IntentFilter getSystemMusicBroadcastFilterAction() {
        IntentFilter musicFilter = new IntentFilter();
        musicFilter.addAction("com.android.music.metachanged");
        musicFilter.addAction("com.android.music.playstatechanged");
        musicFilter.addAction("com.android.music.playbackcomplete");
        musicFilter.addAction("com.android.music.queuechanged");

        musicFilter.addAction("com.htc.music.metachanged");
        musicFilter.addAction("fm.last.android.metachanged");
        musicFilter.addAction("com.sec.android.app.music.metachanged");
        musicFilter.addAction("com.nullsoft.winamp.metachanged");
        musicFilter.addAction("com.amazon.mp3.metachanged");
        musicFilter.addAction("com.miui.player.metachanged");
        musicFilter.addAction("com.real.IMP.metachanged");
        musicFilter.addAction("com.sonyericsson.music.metachanged");
        musicFilter.addAction("com.rdio.android.metachanged");
        musicFilter.addAction("com.samsung.sec.android.MusicPlayer.metachanged");
        musicFilter.addAction("com.andrew.apollo.metachanged");
        return musicFilter;
    }

    public static final String SWITCH_WEIBO_GROUP_BROADCAST = "org.zarroboogs.weibo.switch_weibo_group";

    public static final String SLIDING_MENU_CLOSED_BROADCAST = "org.zarroboogs.weibo.slidingmenu_closed";

    private static final String SEND_COMMENT_OR_REPLY_SUCCESSFULLY = "org.zarroboogs.weibo.SEND.COMMENT.COMPLETED";

    private static final String SEND_REPOST_SUCCESSFULLY = "org.zarroboogs.weibo.SEND.REPOST.COMPLETED";

    public static String buildSendCommentOrReplySuccessfullyAction(MessageBean oriMsg) {
        return SEND_COMMENT_OR_REPLY_SUCCESSFULLY + oriMsg.getId();
    }

    public static String buildSendRepostSuccessfullyAction(MessageBean oriMsg) {
        return SEND_REPOST_SUCCESSFULLY + oriMsg.getId();
    }

}
