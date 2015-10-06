/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.credential.encryptor;

/**
 * Common interface for credential verification.
 */
public interface CredentialMatcher {

  /**
   * Checks a plain credential against an encrypted one.
   *
   * @param plainCredential
   *          The plain credential to check.
   * @param encryptedCredential
   *          The encrypted credential against which to check the credential.
   * @return <code>true</code> if the credential matches, <code>false</code> if the credential does
   *         not match or if one of the parameters is <code>null</code>.
   */
  boolean match(String plainCredential, String encryptedCredential);

}
