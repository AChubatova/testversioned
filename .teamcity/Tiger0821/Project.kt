package Tiger0821

import Tiger0821.buildTypes.*
import Tiger0821.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0821")
    name = "Tiger0821"

    vcsRoot(Tiger0821_cVCSroot)

    buildType(Tiger0821_Hi2)
    buildType(Tiger0821_Hi3)
    buildType(Tiger0821_Hi0)
    buildType(Tiger0821_Hi1)
})
