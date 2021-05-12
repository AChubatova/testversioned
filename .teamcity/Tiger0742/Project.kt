package Tiger0742

import Tiger0742.buildTypes.*
import Tiger0742.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0742")
    name = "Tiger0742"

    vcsRoot(Tiger0742_cVCSroot)

    buildType(Tiger0742_Hi1)
    buildType(Tiger0742_Hi0)
    buildType(Tiger0742_Hi3)
    buildType(Tiger0742_Hi2)
})
