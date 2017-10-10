/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.v1alpha1;

import io.grafeas.ApiException;
import io.grafeas.v1alpha1.model.Note;
import io.grafeas.v1alpha1.model.Occurrence;
import io.grafeas.v1alpha1.model.Empty;
import io.grafeas.v1alpha1.model.Operation;
import io.grafeas.v1alpha1.model.ListNoteOccurrencesResponse;
import io.grafeas.v1alpha1.model.ListNotesResponse;
import io.grafeas.v1alpha1.model.ListOccurrencesResponse;
import io.grafeas.v1alpha1.model.ListOperationsResponse;
import io.grafeas.v1alpha1.model.UpdateOperationRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafeasApi
 */
public class GrafeasApiTest {

    private final GrafeasApi api = new GrafeasApi();

    
    /**
     * 
     *
     * Creates a new note.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNoteTest() throws ApiException {
        String projectsId = null;
        String noteId = null;
        Note note = null;
        // Note response = api.createNote(projectsId, noteId, note);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new occurrence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOccurrenceTest() throws ApiException {
        String projectsId = null;
        Occurrence occurrence = null;
        // Occurrence response = api.createOccurrence(projectsId, occurrence);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the given note from the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNoteTest() throws ApiException {
        String projectsId = null;
        String notesId = null;
        // Empty response = api.deleteNote(projectsId, notesId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the given occurrence from the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOccurrenceTest() throws ApiException {
        String projectsId = null;
        String occurrencesId = null;
        // Empty response = api.deleteOccurrence(projectsId, occurrencesId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the requested occurrence
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteTest() throws ApiException {
        String projectsId = null;
        String notesId = null;
        // Note response = api.getNote(projectsId, notesId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the requested occurrence
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOccurrenceTest() throws ApiException {
        String projectsId = null;
        String occurrencesId = null;
        // Occurrence response = api.getOccurrence(projectsId, occurrencesId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the note that this occurrence is attached to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOccurrenceNoteTest() throws ApiException {
        String projectsId = null;
        String occurrencesId = null;
        // Note response = api.getOccurrenceNote(projectsId, occurrencesId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the requested occurrence
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOperationTest() throws ApiException {
        String projectsId = null;
        String operationsId = null;
        // Operation response = api.getOperation(projectsId, operationsId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists the names of Occurrences linked to a particular Note.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNoteOccurrencesTest() throws ApiException {
        String projectsId = null;
        String notesId = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        // ListNoteOccurrencesResponse response = api.listNoteOccurrences(projectsId, notesId, filter, pageSize, pageToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists all notes for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNotesTest() throws ApiException {
        String projectsId = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        // ListNotesResponse response = api.listNotes(projectsId, filter, pageSize, pageToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists active occurrences for a given project/Digest.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOccurrencesTest() throws ApiException {
        String projectsId = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        // ListOccurrencesResponse response = api.listOccurrences(projectsId, filter, pageSize, pageToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists all operations for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperationsTest() throws ApiException {
        String projectsId = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        // ListOperationsResponse response = api.listOperations(projectsId, filter, pageSize, pageToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates an existing note.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNoteTest() throws ApiException {
        String projectsId = null;
        String notesId = null;
        Note note = null;
        // Note response = api.updateNote(projectsId, notesId, note);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates an existing occurrence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOccurrenceTest() throws ApiException {
        String projectsId = null;
        String occurrencesId = null;
        Occurrence occurrence = null;
        // Occurrence response = api.updateOccurrence(projectsId, occurrencesId, occurrence);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates an existing operation returns an error if operation  does not exist. The only valid operations are to update mark the done bit change the result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOperationTest() throws ApiException {
        String projectsId = null;
        String operationsId = null;
        UpdateOperationRequest body = null;
        // Operation response = api.updateOperation(projectsId, operationsId, body);

        // TODO: test validations
    }
    
}