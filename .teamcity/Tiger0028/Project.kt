package Tiger0028

import Tiger0028.buildTypes.*
import Tiger0028.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0028")
    name = "Tiger0028"

    vcsRoot(Tiger0028_cVCSroot)

    buildType(Tiger0028_Hi3)
    buildType(Tiger0028_Hi0)
    buildType(Tiger0028_Hi2)
    buildType(Tiger0028_Hi1)
})
