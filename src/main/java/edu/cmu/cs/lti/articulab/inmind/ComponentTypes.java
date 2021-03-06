/*
 * Copyright 2018 Carnegie Mellon University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.cmu.cs.lti.articulab.inmind;

/**
 * Constants defining the different types of components able to be handled.
 * These are string constants rather than e.g.&nbsp;enums so that they can be
 * used as compile-time constants for e.g.&nbsp;class annotations.
 *
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-08
 */
public final class ComponentTypes {

	public static final String ID_ASYNC = "ID_ASYNC";
	/**
	 * <p>
	 * A component that does conversational strategy classification.
	 * </p>
	 *
	 * See:
	 * <ul>
	 * <li>Tajfel, Henry &amp; John Turner. 1979. &ldquo;An integrative theory of
	 * intergroup conflict&rdquo;. In: Austin, William G. &amp; Stephen Worchel
	 * (eds.) <em>The social psychology of intergroup relations</em>,
	 * pp.&nbsp;33&ndash;47</li>
	 * <li>Spencer-Oatey, Helen. 2008. &ldquo;Face, (im)politeness and
	 * rapport&rdquo;. In: Spencer-Oatey, Helen (ed.) <em>Culturally Speaking</em>
	 * (2nd ed.), pp.&nbsp;11&ndash;47</li>
	 * </ul>
	 */
	public static final String ID_CSC = "ID_CSC";
	/**
	 * A component that does
	 * <a href="https://en.wikipedia.org/wiki/Dialog_manager">dialog management</a>.
	 */
	public static final String ID_DM = "ID_DM";
	public static final String ID_GUAVA_SERVICE = "ID_GUAVA_SERVICE";
	public static final String ID_LOG_COMPONENT = "ID_LOG_COMPONENT";
	/**
	 * A component that does NLG.
	 */
	public static final String ID_NLG = "ID_NLG";
	/**
	 * A component that does NLU.
	 */
	public static final String ID_NLU = "ID_NLU";
	public static final String ID_NVB = "ID_NVB";
	public static final String ID_OF = "ID_OF";
	public static final String ID_POOL = "ID_POOL";
	public static final String ID_R5 = "ID_R5";
	public static final String ID_REMOTE_COMPONENT = "ID_REMOTE_COMPONENT";
	/**
	 * <p>
	 * A component that does rapport estimation.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Tickle-Degnen, Linda &amp; Robert Rosenthal. 1990. <a href="https://doi.org/10.1207/s15327965pli0104_1">&ldquo;The nature of
	 * rapport and its nonverbal correlates&rdquo;</a>. <em>Psychological inquiry</em>,
	 * 1(4):285&ndash;293</li>
	 * </ul>
	 */
	public static final String ID_RPT = "ID_RPT";
	/**
	 * <p>
	 * A component that does social reasoning.
	 * </p>
	 * See:
	 * <ul>
	 * <li>Romero, Oscar J., Ran Zhao &amp; Justine Cassell. 2017.
	 * <a href="https://doi.org/10.24963/ijcai.2017/532">&ldquo;Cognitive-Inspired
	 * Conversational-Strategy Reasoner for Socially-Aware Agents&rdquo;</a>.
	 * Proceedings of the Twenty-Sixth International Joint Conference on Artificial
	 * Intelligence, pp.&nbsp;3807&ndash;3813</li>
	 * </ul>
	 */
	public static final String ID_SR = "ID_SR";
	public static final String ID_UM = "ID_UM";

	private ComponentTypes() {
		// no instantiation
	}

}
