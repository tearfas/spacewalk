/**
 * Copyright (c) 2008 Red Hat, Inc.
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 * 
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation. 
 */
package com.redhat.rhn.domain.action.kickstart;

import com.redhat.rhn.domain.action.ActionChild;
import com.redhat.rhn.domain.common.FileList;

import java.util.HashSet;
import java.util.Set;

/**
 * KickstartGuestActionDetails - java representation of the rhnActionKickstart table
 * @version $Rev$
 */
public class KickstartGuestActionDetails extends ActionChild {

    private Long kickstartSessionId;
    private String kickstartHost;
    private String guestName;
    private Long memKb;
    private Long vcpus;
    private Long diskGb;
    private String appendString;
    private Set fileLists;
    private Long kickstartId;
    
    /**
     * Adds a FileList object to fileLists.
     * @param f FileList to add
     */
    public void addFileList(FileList f) {
        if (fileLists == null) {
            fileLists = new HashSet();
        }
        fileLists.add(f);
    }
    
    /**
     * @return Returns the fileLists.
     */
    public Set getFileLists() {
        return fileLists;
    }
    
    /**
     * @param f The fileLists to set.
     */
    public void setFileLists(Set f) {
        this.fileLists = f;
    }
    
    /**
     * @return Returns the appendString.
     */
    public String getAppendString() {
        return appendString;
    }
    
    /**
     * @param a The appendString to set.
     */
    public void setAppendString(String a) {
        this.appendString = a;
    }
    
    /**
     * This is the PK for this object.  Its not the 
     * actual ID to a KickstartData object
     * @return Returns the id.
     */
    protected Long getKickstartId() {
        return kickstartId;
    }
    
    /**
     * This is the PK for this object.  Its not the 
     * actual ID to a KickstartData object.  Making 
     * this protected because nobody should really touch this.
     * @param i The id to set.
     */
    protected void setKickstartId(Long i) {
        this.kickstartId = i;
    }

    /**
     * Returns the kickstart session ID.
     * @return The kickstart session ID.
     */
    public Long getKickstartSessionId() {
        return this.kickstartSessionId;
    }

    /**
     * Sets the kickstart session ID.
     * @param ksSessionIdIn The kickstart session ID to set.
     */
    public void setKickstartSessionId(Long ksSessionIdIn) {
        this.kickstartSessionId = ksSessionIdIn;
    }
    
    /**
     * @return Returns the guestName
     */
    public String getGuestName() {
        return this.guestName;
    }

    /**
     * @param guestNameIn the guestName to set.
     */
    public void setGuestName(String guestNameIn) {
        this.guestName = guestNameIn;
    }

    /**
     * @return Returns the memKb
     */
    public Long getMemKb() {
        return memKb;
    }

    /**
     * @param memKbIn the memKb to set.
     */
    public void setMemKb(Long memKbIn) {
        this.memKb = memKbIn;
    }

    /**
     * @return Returns the vcpus
     */
    public Long getVcpus() {
        return vcpus;
    }

    /**
     * @param vcpusIn the vcpus to set.
     */
    public void setVcpus(Long vcpusIn) {
        this.vcpus = vcpusIn;
    }

    /**
     * @return Returns the diskGb
     */
    public Long getDiskGb() {
        return diskGb;
    }

    /**
     * @param diskGbIn the diskGb to set.
     */
    public void setDiskGb(Long diskGbIn) {
        this.diskGb = diskGbIn;
    }

    /**
     * @return the kickstartHost
     */
    public String getKickstartHost() {
        return kickstartHost;
    }

    
    /**
     * @param kickstartHostIn the kickstartHost to set
     */
    public void setKickstartHost(String kickstartHostIn) {
        this.kickstartHost = kickstartHostIn;
    }

}
