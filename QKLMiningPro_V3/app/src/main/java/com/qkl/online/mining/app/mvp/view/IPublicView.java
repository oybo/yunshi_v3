package com.qkl.online.mining.app.mvp.view;

import com.qkl.online.mining.app.data.entity.BaseBean;

/**
 *
 * @param <T>
 */

public interface IPublicView<T extends BaseBean> extends IBaseView {

    void showLoading();

    void hideLoading();

}
