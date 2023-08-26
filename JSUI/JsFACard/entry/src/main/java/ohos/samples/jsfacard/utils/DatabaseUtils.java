/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
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
 */

package ohos.samples.jsfacard.utils;

import ohos.data.orm.OrmContext;
import ohos.data.orm.OrmPredicates;
import ohos.samples.jsfacard.database.Form;

import java.util.List;

/**
 * Card Database Operations
 *
 * @since 2021-08-20
 */
public class DatabaseUtils {
    /**
     * delete form data
     *
     * @param formId form id
     * @param connect data connection
     */
    public static void deleteFormData(long formId, OrmContext connect) {
        OrmPredicates where = connect.where(Form.class);
        where.equalTo("formId", formId);
        List<Form> query = connect.query(where);
        if (!query.isEmpty()) {
            connect.delete(query.get(0));
            connect.flush();
        }
    }

    /**
     * insert card info
     *
     * @param form card object
     * @param connect data connection
     */
    public static void insertForm(Form form, OrmContext connect) {
        connect.insert(form);
        connect.flush();
    }
}
