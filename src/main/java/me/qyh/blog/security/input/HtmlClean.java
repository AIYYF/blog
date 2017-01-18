/*
 * Copyright 2016 qyh.me
 * 
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
package me.qyh.blog.security.input;

/**
 * html文本清理
 * 
 * @author Administrator
 *
 */
@FunctionalInterface
public interface HtmlClean {

	/**
	 * 清理文本
	 * 
	 * @param html
	 *            待清理的html文本
	 * @return 清理后的html文本
	 */
	String clean(String html);

}
